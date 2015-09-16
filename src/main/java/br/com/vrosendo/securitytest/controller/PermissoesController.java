package br.com.vrosendo.securitytest.controller;

import br.com.vrosendo.securitytest.entity.Authority;
import br.com.vrosendo.securitytest.entity.User;
import br.com.vrosendo.securitytest.repository.AuthorityRepository;
import br.com.vrosendo.securitytest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by valdeci on 15/09/2015.
 */
@Controller
public class PermissoesController {

    @Autowired
    AuthorityRepository authorityRepository;
    @Autowired
    UserRepository userRepository;

    @RequestMapping("/permissoes")
    public String permissoes(){
        return "permissoes";
    }

    @RequestMapping("/alterarPerfil")
    public String alterarPerfil(@RequestParam("index") Long index, @AuthenticationPrincipal Principal usuarioLogado){

        org.springframework.security.core.userdetails.User activeUser = (org.springframework.security.core.userdetails.User) ((Authentication) usuarioLogado).getPrincipal();

        User user = userRepository.findOneByUsername(activeUser.getUsername());

        for(Authority auth : user.getAuthorities()){
            authorityRepository.delete(auth);
        }

        List<Authority> novasAuth = new ArrayList<Authority>();

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        List<GrantedAuthority> authorities = null;

        Authority roleUser = new Authority();
        roleUser.setUser(user);
        roleUser.setUsername(user.getUsername());
        roleUser.setAuthority("ROLE_USER");
        novasAuth.add(roleUser);

        if(index==0){
            authorities = AuthorityUtils.createAuthorityList("ROLE_USER", "ROLE_ADMIN", "ROLE_FINANCEIRO", "ROLE_VENDEDOR");

            Authority roleAdmin = new Authority();
            roleAdmin.setUser(user);
            roleAdmin.setUsername(user.getUsername());
            roleAdmin.setAuthority("ROLE_ADMIN");
            novasAuth.add(roleAdmin);

            Authority roleVendedor = new Authority();
            roleVendedor.setUser(user);
            roleVendedor.setUsername(user.getUsername());
            roleVendedor.setAuthority("ROLE_VENDEDOR");
            novasAuth.add(roleVendedor);

            Authority roleFinanceiro = new Authority();
            roleFinanceiro.setUser(user);
            roleFinanceiro.setUsername(user.getUsername());
            roleFinanceiro.setAuthority("ROLE_FINANCEIRO");
            novasAuth.add(roleFinanceiro);

        }
        if(index==1){
            authorities = AuthorityUtils.createAuthorityList("ROLE_USER","ROLE_VENDEDOR");

            Authority roleVendedor = new Authority();
            roleVendedor.setUser(user);
            roleVendedor.setUsername(user.getUsername());
            roleVendedor.setAuthority("ROLE_VENDEDOR");
            novasAuth.add(roleVendedor);

        }
        if(index==2){
            authorities = AuthorityUtils.createAuthorityList("ROLE_USER","ROLE_FINANCEIRO");

            Authority roleFinanceiro = new Authority();
            roleFinanceiro.setUser(user);
            roleFinanceiro.setUsername(user.getUsername());
            roleFinanceiro.setAuthority("ROLE_FINANCEIRO");
            novasAuth.add(roleFinanceiro);

        }

        Authentication newAuth = new UsernamePasswordAuthenticationToken(auth.getPrincipal(),auth.getCredentials(),authorities);
        SecurityContextHolder.getContext().setAuthentication(newAuth);

        for(Authority auth2 : novasAuth){
            authorityRepository.save(auth2);
        }

        return "index";
    }

}

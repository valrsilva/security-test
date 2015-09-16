package br.com.vrosendo.securitytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by valdeci on 16/09/2015.
 */
@Controller
public class RelatoriosController {

    @RequestMapping("/relatorios")
    public String login(){
        return "relatorios";
    }

}

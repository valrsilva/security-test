package br.com.vrosendo.securitytest.teste;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by valdeci on 03/09/2015.
 */
public class Crypt {

    public void md5(){
        Md5PasswordEncoder encoder = new Md5PasswordEncoder();
        System.out.println(encoder.encodePassword("myPrivateKey", null));
    }

    public void bCrypta(){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("teste"));
    }

    public static void main(String[] args) {
        Crypt c = new Crypt();
        c.bCrypta();
        c.md5();
    }

}

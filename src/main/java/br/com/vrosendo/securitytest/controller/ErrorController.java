package br.com.vrosendo.securitytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by valdeci on 15/09/2015.
 */
@Controller
public class ErrorController {

    @RequestMapping("/403")
    public String unauthorized(){
        return "403";
    }

    @RequestMapping("/404")
    public String pageNotFound(){
        return "404";
    }

    @RequestMapping("/invalidCsrf")
    public String invalidCsrf(){
        return "invalidCsrf";
    }
}

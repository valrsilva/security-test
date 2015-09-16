package br.com.vrosendo.securitytest.exception.handler;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.csrf.InvalidCsrfTokenException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by valdeci on 16/09/2015.
 */
public class AccessDeniedExceptionHandler implements AccessDeniedHandler {

    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException arg2) throws IOException, ServletException {

        if(arg2 instanceof InvalidCsrfTokenException){
            response.sendRedirect("invalidCsrf");
        }else{
            response.sendRedirect("403");
        }

    }

}

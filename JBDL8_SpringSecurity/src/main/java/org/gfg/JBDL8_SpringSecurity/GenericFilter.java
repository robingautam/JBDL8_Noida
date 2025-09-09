package org.gfg.JBDL8_SpringSecurity;

import jakarta.servlet.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class GenericFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Inside the filter..");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}

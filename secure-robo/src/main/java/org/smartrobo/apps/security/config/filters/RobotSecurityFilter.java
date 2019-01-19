package org.smartrobo.apps.security.config.filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.security.Principal;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RobotSecurityFilter implements Filter {
    private final static Logger LOGGER = Logger.getLogger(RobotSecurityFilter.class.getName());
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        Principal principal = httpServletRequest.getUserPrincipal();
        if(principal!=null){
        LOGGER.log(Level.INFO,principal.getName());
        }

        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}

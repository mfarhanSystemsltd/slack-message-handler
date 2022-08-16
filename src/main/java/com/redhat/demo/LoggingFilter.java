package com.redhat.demo;

import java.nio.charset.StandardCharsets;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;

import org.jboss.logging.Logger;
import org.jboss.resteasy.reactive.server.ServerResponseFilter;

public class LoggingFilter {

    private static final Logger LOG = Logger.getLogger(LoggingFilter.class);

    @ServerResponseFilter
    public void filter(ContainerRequestContext request, ContainerResponseContext response) throws Exception {
        LOG.info(new String(request.getEntityStream().readAllBytes(), StandardCharsets.UTF_8));
    }   
    
}

package com.redhat.demo;

import java.nio.charset.StandardCharsets;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.core.MediaType;

import org.jboss.logging.Logger;
import org.jboss.resteasy.reactive.server.ServerResponseFilter;

import io.smallrye.common.annotation.Blocking;
import io.smallrye.mutiny.Uni;

@Path("/releaseApp")
public class SlackMessageResource {

    private static final Logger LOG = Logger.getLogger(SlackMessageResource.class);

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Blocking
    public String releaseApplication() {
        return "{\"message\":\"ok\"}";
    }

    @ServerResponseFilter
    public Uni<Void> filter(ContainerRequestContext request, ContainerResponseContext response) throws Exception {
        LOG.info(new String(request.getEntityStream().readAllBytes(), StandardCharsets.UTF_8));
        return Uni.createFrom().nullItem();
    }   
}
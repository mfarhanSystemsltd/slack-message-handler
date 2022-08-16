package com.redhat.demo;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.logging.Logger;

@Path("/releaseApp")
public class SlackMessageResource {

    private static final Logger LOG = Logger.getLogger(SlackMessageResource.class);

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String releaseApplication() {
        return "{\"message\":\"ok\"}";
    }
}
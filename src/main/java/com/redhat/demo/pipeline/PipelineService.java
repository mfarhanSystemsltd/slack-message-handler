package com.redhat.demo.pipeline;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/")
@RegisterRestClient(configKey="pipeline-service")
public interface PipelineService {
    
    @POST
    @Consumes("application/json")
    String startPipeline(PushToProdPipeline model);
}

package com.redhat.demo.pipeline;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PushToProdPipeline {
    
    @JsonProperty("gitrevision")
    public String gitRevision;

    @JsonProperty("app")
    public String application;

    public String cluster;

    @JsonProperty("image_dest_url")
    public String imageURL;

    @JsonProperty("image_dest_tag")
    public String imageTag;

}

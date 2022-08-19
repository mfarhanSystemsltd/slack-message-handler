package com.redhat.demo.pipeline;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PushToProdPipeline {
    
    @JsonProperty("git_url")
    public String gitURL;

    @JsonProperty("git_source_url")
    public String gitSourceURL;

    @JsonProperty("git_revision")
    public String gitRevision;

    @JsonProperty("app")
    public String application;

    public String cluster;

    @JsonProperty("image_dest_url")
    public String imageURL;

    @JsonProperty("image_dest_tag")
    public String imageTag;

    @Override
    public String toString() {
        return gitURL+ ", " + gitRevision + "," + application +", " + cluster +", " + imageURL + ", " + imageTag;
    }
}

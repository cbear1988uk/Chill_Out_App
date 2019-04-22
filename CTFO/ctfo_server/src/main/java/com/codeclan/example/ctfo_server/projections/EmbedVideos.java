package com.codeclan.example.ctfo_server.projections;

import com.codeclan.example.ctfo_server.models.Mood;
import com.codeclan.example.ctfo_server.models.Video;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedVideos", types = Video.class)
public interface EmbedVideos {
    long getId();
    String getVideoUrl();
    Mood getMood();
}

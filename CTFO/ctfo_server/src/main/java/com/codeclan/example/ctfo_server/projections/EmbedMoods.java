package com.codeclan.example.ctfo_server.projections;

import com.codeclan.example.ctfo_server.models.Image;
import com.codeclan.example.ctfo_server.models.Mood;
import com.codeclan.example.ctfo_server.models.Quote;
import com.codeclan.example.ctfo_server.models.Video;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedMoods", types = Mood.class)
public interface EmbedMoods {
    long getId();
    String getName();
    List<Quote> getQuotes();
    List<Image> getImages();
    List<Video> getVideos();
}

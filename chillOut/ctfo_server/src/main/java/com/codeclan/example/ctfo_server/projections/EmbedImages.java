package com.codeclan.example.ctfo_server.projections;

import com.codeclan.example.ctfo_server.models.Mood;
import com.codeclan.example.ctfo_server.models.Image;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedImages", types = Image.class)
public interface EmbedImages {
    long getId();
    String getImageUrl();
    List<Mood> getMoods();
}

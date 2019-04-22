package com.codeclan.example.ctfo_server.projections;

import com.codeclan.example.ctfo_server.models.Mood;
import com.codeclan.example.ctfo_server.models.Quote;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedQuotes", types = Quote.class)
public interface EmbedQuotes {
    long getId();
    String getText();
    String getAuthor();
    Mood getMood();
}

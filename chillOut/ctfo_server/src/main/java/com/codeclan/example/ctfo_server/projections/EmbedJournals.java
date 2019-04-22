package com.codeclan.example.ctfo_server.projections;

import com.codeclan.example.ctfo_server.models.Journal;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "embedMoodJournals", types = Journal.class)
public interface EmbedJournals {
    long getId();
    Date getDate();
    String getComment();
    String getEndMood();
}

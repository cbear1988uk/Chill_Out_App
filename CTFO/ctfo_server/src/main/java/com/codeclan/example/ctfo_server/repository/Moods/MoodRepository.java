package com.codeclan.example.ctfo_server.repository.Moods;

import com.codeclan.example.ctfo_server.models.Mood;
import com.codeclan.example.ctfo_server.projections.EmbedMoods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedMoods.class)
public interface MoodRepository extends JpaRepository<Mood, Long>, MoodRepositoryCustom {
}

package com.codeclan.example.ctfo_server.repository.Videos;

import com.codeclan.example.ctfo_server.models.Video;
import com.codeclan.example.ctfo_server.projections.EmbedVideos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedVideos.class)
public interface VideoRepository extends JpaRepository<Video, Long>, VideoRepositoryCustom {
}

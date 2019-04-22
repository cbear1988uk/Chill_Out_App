package com.codeclan.example.ctfo_server.repository.Images;

import com.codeclan.example.ctfo_server.models.Image;
import com.codeclan.example.ctfo_server.projections.EmbedImages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedImages.class)
public interface ImageRepository extends JpaRepository<Image, Long>, ImageRepositoryCustom {
}

package com.codeclan.example.ctfo_server.repository.Journals;

import com.codeclan.example.ctfo_server.models.Journal;
import com.codeclan.example.ctfo_server.projections.EmbedJournals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedJournals.class)
public interface JournalRepository extends JpaRepository<Journal, Long>, JournalRepositoryCustom {
}

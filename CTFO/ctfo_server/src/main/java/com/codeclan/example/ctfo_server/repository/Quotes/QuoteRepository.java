package com.codeclan.example.ctfo_server.repository.Quotes;

import com.codeclan.example.ctfo_server.models.Quote;
import com.codeclan.example.ctfo_server.projections.EmbedQuotes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedQuotes.class)
public interface QuoteRepository extends JpaRepository<Quote, Long>, QuoteRepositoryCustom {
}

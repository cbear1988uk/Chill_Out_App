package com.codeclan.example.ctfo_server.models;

import com.codeclan.example.ctfo_server.models.Mood;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "quotes")
public class Quote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "text")
    private String text;

    @Column(name = "author")
    private String author;

    @JsonIgnoreProperties("quotes")
    @ManyToOne
    @JoinColumn(name = "mood_id", nullable = false)
    private Mood mood;

    public Quote(String text, String author, Mood mood) {
        this.text = text;
        this.author = author;
        this.mood = mood;
    }

    public Quote() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Mood getMood() {
        return mood;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }
}

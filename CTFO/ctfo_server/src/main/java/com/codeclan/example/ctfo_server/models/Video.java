package com.codeclan.example.ctfo_server.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "videos")
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "video_url")
    private String videoUrl;

    @JsonIgnoreProperties("videos")
    @ManyToOne
    @JoinColumn(name = "mood_id", nullable = false)
    private Mood mood;

    public Video(String videoUrl, Mood mood) {
        this.videoUrl = videoUrl;
        this.mood = mood;
    }

    public Video() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Mood getMood() {
        return mood;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }
}

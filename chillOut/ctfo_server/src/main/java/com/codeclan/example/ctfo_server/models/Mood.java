package com.codeclan.example.ctfo_server.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "moods")
public class Mood implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @JsonIgnoreProperties("moods")
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @OneToMany(mappedBy = "mood", fetch = FetchType.LAZY)
    private List<Quote> quotes;

    @JsonIgnoreProperties("moods")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            joinColumns = {@JoinColumn(name = "mood_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "image_id", nullable = false, updatable = false)}
    )
    private List<Image> images;

    @JsonIgnoreProperties("moods")
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @OneToMany(mappedBy = "mood", fetch = FetchType.LAZY)
    private List<Video> videos;

    public Mood(String name) {
        this.name = name;
        this.quotes = new ArrayList<>();
        this.images = new ArrayList<>();
        this.videos = new ArrayList<>();
    }

    public Mood() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Quote> getQuotes() {
        return this.quotes;
    }

    public void setQuotes(List<Quote> quotes) {
        this.quotes = quotes;
    }

    public List<Image> getImages() {
        return this.images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public List<Video> getVideos() {
        return this.videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    public void addQuote(Quote quote) {
        this.quotes.add(quote);
    }

    public void addImage(Image image) {
        this.images.add(image);
    }

    public void addVideo(Video video) {
        this.videos.add(video);
    }

}


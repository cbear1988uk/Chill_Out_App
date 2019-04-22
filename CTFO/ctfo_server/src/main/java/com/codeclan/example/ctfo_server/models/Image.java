package com.codeclan.example.ctfo_server.models;

import com.codeclan.example.ctfo_server.models.Mood;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "images")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "image_url")
    private String imageUrl;

    @JsonIgnoreProperties("images")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "moods_images",
            joinColumns = {@JoinColumn(name = "image_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "mood_id", nullable = false, updatable = false)}
    )
    private List<Mood> moods;


    public Image(String imageUrl) {
        this.imageUrl = imageUrl;
        this.moods = new ArrayList<>();
    }

    public Image() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<Mood> getMoods() {
        return moods;
    }

    public void setMoods(List<Mood> moods) {
        this.moods = moods;
    }

    public void addMood(Mood mood) {
        this.moods.add(mood);
    }
}

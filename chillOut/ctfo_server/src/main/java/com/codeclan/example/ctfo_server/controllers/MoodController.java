package com.codeclan.example.ctfo_server.controllers;

import com.codeclan.example.ctfo_server.models.Mood;
import com.codeclan.example.ctfo_server.repository.Moods.MoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/moods")
public class MoodController {

    @Autowired
    MoodRepository moodRepository;

    @GetMapping
    public List<Mood> getAllMoods() {
        return moodRepository.findAll();
    }


}

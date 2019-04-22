package com.codeclan.example.ctfo_server.controllers;

import com.codeclan.example.ctfo_server.repository.Videos.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/videos")
public class VideoController {

    @Autowired
    VideoRepository videoRepository;

//    @GetMapping
//    public List<Video> getAllVideos() {
//        return videoRepository.findAll();
//    }
}

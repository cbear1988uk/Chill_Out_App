package com.codeclan.example.ctfo_server.controllers;

import com.codeclan.example.ctfo_server.repository.Journals.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/journals")
public class JournalController {

    @Autowired
    JournalRepository journalRepository;

}

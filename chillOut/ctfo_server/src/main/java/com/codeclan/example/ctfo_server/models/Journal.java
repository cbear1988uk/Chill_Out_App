package com.codeclan.example.ctfo_server.models;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "journals")
public class Journal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date")
//    @Temporal(TemporalType.DATE)
    private Date date;

    @Column(name = "comment")
    private String comment;

    @Column(name = "endMood")
    private String endMood;


    public Journal(Date date, String comment, String endMood){
        this.date = date;
        this.comment = comment;
        this.endMood = endMood;
    }

    public Journal(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getEndMood() {
        return endMood;
    }

    public void setEndMood(String endMood) {
        this.endMood = endMood;
    }



}

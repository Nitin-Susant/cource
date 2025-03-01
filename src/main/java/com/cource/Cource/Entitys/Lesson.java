package com.cource.Cource.Entitys;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Long duration;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "courceId",referencedColumnName = "id",nullable = false)
    private Course course;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,orphanRemoval = true,mappedBy = "lesson")
    private List<Viedo> lessons = new ArrayList<>();

    // Getters and Setters


    public Lesson() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Viedo> getLessons() {
        return lessons;
    }

    public void setLessons(List<Viedo> lessons) {
        this.lessons = lessons;
    }
}


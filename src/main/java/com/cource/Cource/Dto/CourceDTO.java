package com.cource.Cource.Dto;

import com.cource.Cource.Entitys.Lesson;

import java.util.ArrayList;
import java.util.List;

public class CourceDTO {
    private Long id;
    private String title;
    private String description;

    List<Lesson> lessons = new ArrayList<>();
}

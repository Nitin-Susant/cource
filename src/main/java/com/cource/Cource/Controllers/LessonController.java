package com.cource.Cource.Controllers;


import com.cource.Cource.Entitys.Lesson;
import com.cource.Cource.Service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lessons")
public class LessonController {

    @Autowired
    private LessonService lessonService;


    @PostMapping
    public Lesson addLesson(@RequestBody Lesson lesson) {
        return lessonService.addLesson(lesson);
    }

    @DeleteMapping("/{id}")
    public void deleteLesson(@PathVariable Long id) {
        lessonService.deleteLesson(id);
    }
}

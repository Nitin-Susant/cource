package com.cource.Cource.Controllers;



import com.cource.Cource.Entitys.Course;
import com.cource.Cource.Entitys.Lesson;
import com.cource.Cource.Service.CourseService;
import com.cource.Cource.Service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @Autowired
    private LessonService lessonService;


    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable Long id) {
        return courseService.getCourseById(id);
    }

    @PostMapping
    public Course addCourse(@RequestBody Course course) {
        System.out.println(course);
        return courseService.addCourse(course);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
    }


    @GetMapping("/getlessons/{id}")
    public List<Lesson> getLessonsByCourceId(@PathVariable Long id) {

        return courseService.getLessonById(id);
    }

//    @PostMapping("/addlessons")
//    public Lesson addLesson(@RequestBody Lesson lesson) {
//        return lessonService.addLesson(lesson);
//    }


}

package com.cource.Cource.Repository;

import com.cource.Cource.Entitys.Course;
import com.cource.Cource.Entitys.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    @Query(name = "select * from public.lesson where cource_id = :id",nativeQuery = true)
    public List<Lesson> findByCourseId(@Param("id") Long id);


}

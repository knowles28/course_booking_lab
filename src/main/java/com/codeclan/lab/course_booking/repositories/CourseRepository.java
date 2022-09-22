package com.codeclan.lab.course_booking.repositories;

import com.codeclan.lab.course_booking.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findByRating(Double rating);

    List<Course> findByBookingsCustomerId(Long id);
}

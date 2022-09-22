package com.codeclan.lab.course_booking.repositories;

import com.codeclan.lab.course_booking.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}

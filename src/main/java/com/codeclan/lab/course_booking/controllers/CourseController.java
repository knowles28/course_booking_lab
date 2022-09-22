package com.codeclan.lab.course_booking.controllers;

import com.codeclan.lab.course_booking.models.Booking;
import com.codeclan.lab.course_booking.models.Course;
import com.codeclan.lab.course_booking.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/courses")
    public ResponseEntity<List<Course>> getAllCourses(){
        return new ResponseEntity<>(courseRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/courses/rating")
    public ResponseEntity<List<Course>> getCoursesWithRating(@RequestParam(name = "rating") Double rating){
        return new ResponseEntity<>(courseRepository.findByRating(rating), HttpStatus.OK);
    }

    @GetMapping(value = "/courses/customers/{id}")
    public ResponseEntity<List<Course>> getCustomersOnCourseById(@PathVariable Long id){
        return new ResponseEntity<>(courseRepository.findByBookingsCustomerId(id), HttpStatus.OK);
    }
}

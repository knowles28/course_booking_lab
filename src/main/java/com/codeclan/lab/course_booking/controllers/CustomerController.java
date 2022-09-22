package com.codeclan.lab.course_booking.controllers;

import com.codeclan.lab.course_booking.models.Course;
import com.codeclan.lab.course_booking.models.Customer;
import com.codeclan.lab.course_booking.repositories.CourseRepository;
import com.codeclan.lab.course_booking.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/customers")
    public ResponseEntity<List<Customer>> getAllCourses(){
        return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/customers/courses/{id}")
    public ResponseEntity<List<Customer>> getCustomersByCourse(@PathVariable Long id){
        return new ResponseEntity<>(customerRepository.findByBookingsCourseId(id), HttpStatus.OK);
    }
}


package com.codeclan.lab.course_booking.repositories;

import com.codeclan.lab.course_booking.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

package com.codeclan.lab.course_booking.repositories;

import com.codeclan.lab.course_booking.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Book;
import java.time.LocalDate;
import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {


    List<Booking> findByDate(LocalDate date);
}

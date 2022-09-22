package com.codeclan.lab.course_booking.repositories;

import com.codeclan.lab.course_booking.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}

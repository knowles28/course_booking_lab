package com.codeclan.lab.course_booking.components;

import com.codeclan.lab.course_booking.models.Booking;
import com.codeclan.lab.course_booking.models.Course;
import com.codeclan.lab.course_booking.models.Customer;
import com.codeclan.lab.course_booking.repositories.BookingRepository;
import com.codeclan.lab.course_booking.repositories.CourseRepository;
import com.codeclan.lab.course_booking.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.awt.print.Book;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

@Component
public class DataLoader implements ApplicationRunner {

    public DataLoader() {
    }

    @Autowired
    BookingRepository bookingRepository;
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    CourseRepository courseRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {



        LocalDate date1 = LocalDate.of(2022, Month.SEPTEMBER, 22);
        LocalDate date2 = LocalDate.of(2022, Month.SEPTEMBER, 23);
        LocalDate date3 = LocalDate.of(2022, Month.SEPTEMBER, 24);
        LocalDate date4 = LocalDate.of(2022, Month.SEPTEMBER, 27);
        LocalDate date5 = LocalDate.of(2022, Month.SEPTEMBER, 28);

        Course courseFrench = new Course("French", "Edinburgh", 4.0);
        courseRepository.save(courseFrench);
        Course courseSpanish = new Course("Spanish", "Edinburgh", 5.0);
        courseRepository.save(courseSpanish);
        Course courseGerman = new Course("German", "Glasgow",3.5);
        courseRepository.save(courseGerman);

        Customer customer1 = new Customer("Ethan", "Falkirk", 27);
        customerRepository.save(customer1);
        Customer customer2 = new Customer("Sam","Edinburgh", 27);
        customerRepository.save(customer2);
        Customer customer3 = new Customer("Lawrie", "Leith", 30);
        customerRepository.save(customer3);

        Booking booking1 = new Booking(date1, courseFrench, customer1);
        bookingRepository.save(booking1);
        customer1.addBooking(booking1);
        customerRepository.save(customer1);
        courseFrench.addBooking(booking1);
        courseRepository.save(courseFrench);

        Booking booking2 = new Booking(date2, courseGerman, customer1);
        bookingRepository.save(booking2);
        customer1.addBooking(booking2);
        customerRepository.save(customer1);
        courseGerman.addBooking(booking2);
        courseRepository.save(courseGerman);

        Booking booking3 = new Booking(date1, courseFrench, customer2);
        bookingRepository.save(booking3);
        customer2.addBooking(booking3);
        customerRepository.save(customer2);
        courseFrench.addBooking(booking3);
        courseRepository.save(courseFrench);

        Booking booking4 = new Booking(date4, courseSpanish, customer3);
        bookingRepository.save(booking4);
        customer3.addBooking(booking3);
        customerRepository.save(customer3);
        courseSpanish.addBooking(booking4);
        courseRepository.save(courseSpanish);









    }
}

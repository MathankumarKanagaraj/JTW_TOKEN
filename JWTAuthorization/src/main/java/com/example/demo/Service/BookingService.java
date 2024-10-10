package com.example.demo.Service;

import com.example.demo.Entity.Booking;
import com.example.demo.Repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {
    @Autowired
    BookingRepository bookingRepository;

    public Booking saveBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public List<Booking> getAllBooking() {
        return bookingRepository.findAll();
    }

    public Booking updateBooking(String id, Booking bookingDetails) {
        Optional<Booking> optionalBooking = bookingRepository.findById(id);
        if(optionalBooking.isPresent()){
            Booking booking=optionalBooking.get();
            booking.setStartLocation(bookingDetails.getStartLocation());
            booking.setEndLocation(bookingDetails.getEndLocation());
            booking.setStartTime(bookingDetails.getStartTime());
            booking.setEndTime(bookingDetails.getEndTime());
            booking.setTotalCast(bookingDetails.getTotalCast());
            return bookingRepository.save(booking);
        }return null;
    }

    public void deleteBooking(String id){
        bookingRepository.deleteById(id);
    }

}
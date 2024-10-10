package com.example.demo.Controller;

import com.example.demo.Entity.Booking;
import com.example.demo.Service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api-booking")
public class BookingController {
    @Autowired
    BookingService bookingService;

    @PostMapping("/create-booking")
    public Booking createBooking(@RequestBody Booking booking){
        return bookingService.saveBooking(booking);

    }

    @GetMapping("/get-car")
    public List<Booking> getAllBooking() {
        return bookingService.getAllBooking();
    }

    @PutMapping("/booking-update")
    public Booking updateBooking(@PathVariable String id, @RequestBody Booking updateBooking){
        return bookingService.updateBooking(id,updateBooking);
    }

    @DeleteMapping("/booking-delete")
    public void deleteBooking(@PathVariable String id){
        bookingService.deleteBooking(id);
    }
}

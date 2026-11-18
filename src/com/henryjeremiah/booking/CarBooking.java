package com.henryjeremiah.booking;

import com.henryjeremiah.car.Car;
import com.henryjeremiah.user.User;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class CarBooking {
    private UUID bookingId;
    private User user;
    private Car car;
    private BookingStatus status;
    private BigDecimal price ;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDateTime bookedAt;

}

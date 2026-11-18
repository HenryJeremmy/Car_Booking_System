package com.henryjeremiah.booking;

import com.henryjeremiah.car.Car;
import com.henryjeremiah.user.User;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
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

    public CarBooking(UUID bookingId, User user, Car car, BookingStatus status, BigDecimal price,
                      LocalDate startDate, LocalDate endDate, LocalDateTime bookedAt) {
        this.bookingId = bookingId;
        this.user = user;
        this.car = car;
        this.status = status;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
        this.bookedAt = bookedAt;
    }

    public UUID getBookingId() {
        return bookingId;
    }

    public void setBookingId(UUID bookingId) {
        this.bookingId = bookingId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDateTime getBookedAt() {
        return bookedAt;
    }

    public void setBookedAt(LocalDateTime bookedAt) {
        this.bookedAt = bookedAt;
    }

    @Override
    public String toString() {
        return "CarBooking{" +
                "bookingId=" + bookingId +
                ", user=" + user +
                ", car=" + car +
                ", status=" + status +
                ", price=" + price +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", bookedAt=" + bookedAt +
                '}' ;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CarBooking that = (CarBooking) o;
        return Objects.equals(bookingId, that.bookingId) && Objects.equals(user, that.user) && Objects.equals(car, that.car) && status == that.status && Objects.equals(price, that.price) && Objects.equals(startDate, that.startDate) && Objects.equals(endDate, that.endDate) && Objects.equals(bookedAt, that.bookedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId, user, car, status, price, startDate, endDate, bookedAt);
    }
}

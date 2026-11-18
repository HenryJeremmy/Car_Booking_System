package com.henryjeremiah.car;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

public class Car {
    private UUID carId;
    private BigDecimal rentalPricePerDay;
    private Brand brand;

    public Car(UUID carId, BigDecimal rentalPricePerDay, Brand brand) {
        this.carId = carId;
        this.rentalPricePerDay = rentalPricePerDay;
        this.brand = brand;
    }

    public UUID getCarId() {
        return carId;
    }

    public void setCarId(UUID carId) {
        this.carId = carId;
    }

    public BigDecimal getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public void setRentalPricePerDay(BigDecimal rentalPricePerDay) {
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", rentalPricePerDay=" + rentalPricePerDay +
                ", brand=" + brand +
                '}' ;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(carId, car.carId) && Objects.equals(rentalPricePerDay, car.rentalPricePerDay) && brand == car.brand;
    }

    @Override
    public int hashCode() {
        return Objects.hash(carId, rentalPricePerDay, brand);
    }
}

package com.henryjeremiah.car;

import com.henryjeremiah.user.User;

import java.math.BigDecimal;
import java.util.UUID;

public class CarDao {
    private  static  final Car[] cars;
    static {
        cars = new Car[]{
                new Car(UUID.fromString("70c90c9e-d7e4-4013-9b04-17577e45aa76"),
                        new BigDecimal("15.0"), Brand.AUDI),

                new Car(UUID.fromString("3fff398b-8506-4c0c-ad9c-f15f3222b037"), new BigDecimal( "18.0"),
                        Brand.KIA),
                new Car(UUID.fromString("e8ad6f27-f723-49a1-aad4-35bc16f3a83d"), new BigDecimal( "17.0"),
                        Brand.BMW)
        };
    }

    public Car[] getCars(){
        return cars;
    }


}

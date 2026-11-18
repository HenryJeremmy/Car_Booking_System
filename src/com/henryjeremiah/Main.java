package com.henryjeremiah;

import com.henryjeremiah.car.Car;
import com.henryjeremiah.car.CarDao;
import com.henryjeremiah.user.User;
import com.henryjeremiah.user.UserDao;

public class Main {
        public static void main(String[] args) {
            System.out.println("Car Booking System");

            CarDao carDao = new CarDao();

            for (Car cars : carDao.getCars()) {   // use your method's name
                System.out.println(cars);
            }


        }

}

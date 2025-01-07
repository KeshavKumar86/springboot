package com.keshav.modeule2practice.rest;

import com.keshav.modeule2practice.common.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import util.Bike;
import util.Bus;

@RestController
public class FunController {

    private final Car car;

    private Bike bike;

    //field injection
    @Autowired
    private Bus bus;

    @Autowired
    public void setBike(Bike bike) {
        this.bike = bike;
    }

    @Autowired
    public FunController(@Qualifier("tataCar") Car car, @Qualifier("getMahindraCar") Car anotherCar) {
        System.out.println("In Constructor: " + getClass().getName());
        this.car = car;
        System.out.println("In Constructor: " + getClass().getName() + (car == anotherCar));
    }

    @GetMapping("/GetWork")
    public String getWork() {
        return "Practice 2 DSA Questions daily";
    }

    @GetMapping("GetCar")
    public String getCar() {
        return car.giveCar();
    }

    @GetMapping("GetBike")
    public String getBike() {
        return bike.getBike();
    }

    @GetMapping("GetBus")
    public String getBus() {
        return bus.getBus();
    }
}

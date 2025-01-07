package com.keshav.modeule2practice.common;

import org.springframework.stereotype.Component;

@Component
public class HyundaiCar implements Car {

    public HyundaiCar() {
        System.out.println("In Constructor: " + getClass().getName());
    }

    @Override
    public String giveCar() {
        return "Hyundai Verna Car";
    }
}

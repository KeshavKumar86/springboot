package com.keshav.modeule2practice.common;

import org.springframework.context.annotation.Primary;

@Primary
public class MahindraCar implements Car {

    public MahindraCar() {
        System.out.println("In Constructor: " + getClass().getName());
    }

    @Override
    public String giveCar() {
        return "Mahindra Thar";
    }
}

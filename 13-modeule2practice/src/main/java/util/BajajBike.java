package util;

import org.springframework.stereotype.Component;

@Component
public class BajajBike implements Bike {

    public BajajBike() {
        System.out.println("In Constructor: " + getClass().getName());
    }

    @Override
    public String getBike() {
        return "Bajaj Pulsar Bike";
    }
}

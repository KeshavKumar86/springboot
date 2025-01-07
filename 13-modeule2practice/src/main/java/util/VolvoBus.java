package util;

import org.springframework.stereotype.Component;

@Component
public class VolvoBus implements Bus{

    public VolvoBus() {
        System.out.println("In Constructor: " + getClass().getName());
    }

    @Override
    public String getBus() {
        return "Volvo Bus";
    }
}

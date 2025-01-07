package com.keshav.modeule2practice.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TataCar implements Car{

    public TataCar() {
        System.out.println("In Constructor: " + getClass().getName());
    }

    @Override
    public String giveCar() {
        return "Tata Harrier Car";
    }
    @PostConstruct
    public void doSetupStuff(){
        System.out.println("Doing some DB Connection,File Opening, Socket Connection");
    }
    @PreDestroy
    public void doCleanupStuff(){
        System.out.println("Doing some clean of DB Connection, File Closing, Socket Connection");
    }
}

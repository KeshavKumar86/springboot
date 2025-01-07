package com.keshav.modeule2practice.config;

import com.keshav.modeule2practice.common.Car;
import com.keshav.modeule2practice.common.MahindraCar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {

    @Bean
    public Car getMahindraCar() {
        return new MahindraCar();
    }
}

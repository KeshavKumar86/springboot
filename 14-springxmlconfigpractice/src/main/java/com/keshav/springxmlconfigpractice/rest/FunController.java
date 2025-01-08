package com.keshav.springxmlconfigpractice.rest;

import com.keshav.springxmlconfigpractice.bean.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunController {

    private final Employee employee;

    public FunController(Employee employee) {
        this.employee = employee;
    }
    @GetMapping("GetEmployee")
    public String getEmployee(){
        return employee.toString();
    }
}

package com.nitinjyoti.springbootstarter.employee;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    
    @RequestMapping(value="/employee", method = {RequestMethod.GET,RequestMethod.POST})
    public List<EmployeeBean> getAllEmployee(){
        List<EmployeeBean>  emplist = null;
        try {
            
            emplist = Arrays.asList(new EmployeeBean(1, "Darshan Parekh", "IT"),new EmployeeBean(2, "Shankar Pattanayak", "IT"),
            new EmployeeBean(3, "Kushal Soni", "SALES"), new EmployeeBean(4, "Ashlesh Vachhani", "INSURANCE"));

        } catch (Exception e) {
            System.out.println("some error occurd while getting all employee list caused by :: " + e.toString());
        }

        return emplist;
    }

}

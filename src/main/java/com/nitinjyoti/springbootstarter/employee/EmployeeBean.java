package com.nitinjyoti.springbootstarter.employee;

import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    
    private long id;
    private String name;
    private String designation;

    
    public EmployeeBean() {
    }
    
    public EmployeeBean(long id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    

}

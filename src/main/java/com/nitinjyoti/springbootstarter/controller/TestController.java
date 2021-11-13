package com.nitinjyoti.springbootstarter.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @GetMapping(value = "/check")
    public String getUrlStatusMessage(@RequestParam String url){
        System.out.println("getUrl invoked");
        String message = "";
        try {
            message = url;
            
        } catch (Exception e) {
            System.out.println("error message occured while getting the connection caused by :: "+ e.toString());
        }
        return message;
    }
}

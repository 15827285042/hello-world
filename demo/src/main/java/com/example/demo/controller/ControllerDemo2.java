package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDemo2 {
    @RequestMapping("/start")
    public String start(){
        return "!!!";
    }
}

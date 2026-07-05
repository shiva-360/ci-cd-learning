package com.sharma.ec2Deployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sharma")
public class HomeController {


    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome Come to Raahul";
    }
}

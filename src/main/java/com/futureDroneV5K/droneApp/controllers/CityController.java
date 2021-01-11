package com.futureDroneV5K.droneApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CityController {
    @GetMapping("/city")
    public String goHome() {
        return "city";
    }
}

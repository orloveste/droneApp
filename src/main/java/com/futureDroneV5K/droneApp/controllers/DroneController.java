package com.futureDroneV5K.droneApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DroneController {
    @GetMapping("/drones")
    public String getDrones() {
        return "drones";
    }
}

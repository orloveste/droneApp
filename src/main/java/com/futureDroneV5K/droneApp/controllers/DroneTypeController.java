package com.futureDroneV5K.droneApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class DroneTypeController {
    @GetMapping("/dronetype")
    public String goHome() {
        return "dronetype";
    }
}

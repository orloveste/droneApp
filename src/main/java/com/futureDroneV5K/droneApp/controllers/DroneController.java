package com.futureDroneV5K.droneApp.controllers;

import com.futureDroneV5K.droneApp.models.Drone;
import com.futureDroneV5K.droneApp.services.CityService;
import com.futureDroneV5K.droneApp.services.DroneService;
import com.futureDroneV5K.droneApp.services.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DroneController {
    @Autowired
    private DroneService droneService;
    @Autowired private CityService cityService;
    @Autowired private RegionService regionService;

    @GetMapping("/drones")
    public String getDrones(Model model){
        model.addAttribute("drones", droneService.getDrones());

        return "drone";
    }
    @PostMapping("/drones/addNew")
    public String addNew(Drone drone){
        droneService.saveDrone(drone);
        return "redirect:/drones";
    }
    @RequestMapping(value = "/drones/findById")
    @ResponseBody
    public Drone findById(Long id){
        return droneService.findById(id);
    }
    @RequestMapping(value= "/drones/update",
            method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Drone drone){
        droneService.saveDrone(drone);
        return "redirect:/drones";
    }
    @RequestMapping(value = "/drones/delete",
            method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Long id){
        droneService.delete(id);
        return "redirect:/drones";
    }
}

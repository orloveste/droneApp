package com.futureDroneV5K.droneApp.controllers;

import com.futureDroneV5K.droneApp.models.DroneTracker;
import com.futureDroneV5K.droneApp.services.LocationService;
import com.futureDroneV5K.droneApp.services.DroneTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class DroneTrackerController {
    @Autowired
    private DroneTrackerService droneTrackerService;
    @Autowired private LocationService locationService;


    @GetMapping("/droneTrackers")
    public String getDroneTrackers(Model model){
        List<DroneTracker> droneTrackerList = droneTrackerService.getDroneTracker();
        model.addAttribute("droneTrackers", droneTrackerList);
//        short version
        model.addAttribute("locations", locationService.getLocations());


        return "droneTracker";
    }
    @PostMapping("/droneTrackers/addNew")
    public String addNew(DroneTracker droneTracker){
        droneTrackerService.saveDroneTracker(droneTracker);
        return "redirect:/droneTrackers";
    }
    @RequestMapping(value = "/droneTrackers/findById")
    @ResponseBody
    public DroneTracker findById(Long id){
        return droneTrackerService.findById(id);
    }
    @RequestMapping(value= "/droneTrackers/update",
            method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(DroneTracker droneTracker){
        droneTrackerService.saveDroneTracker(droneTracker);
        return "redirect:/droneTrackers";
    }
    @RequestMapping(value = "/droneTrackers/delete",
            method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Long id){
        droneTrackerService.delete(id);
        return "redirect:/droneTrackers";
    }
}

package com.futureDroneV5K.droneApp.controllers;

import com.futureDroneV5K.droneApp.models.DroneType;
import com.futureDroneV5K.droneApp.services.DroneTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class DroneTypeController {
    @Autowired
    private DroneTypeService droneTypeService;

    @GetMapping("/droneTypes")
    public String getDroneType(Model model) {

        List<DroneType> droneTypeList = droneTypeService.getDroneTypes();
        model.addAttribute("droneTypes", droneTypeList);

        return "droneType";
    }
    @PostMapping("/droneTypes/addNew")
    public String addNew(DroneType location){
        droneTypeService.saveDroneType(location);
        return "redirect:/droneTypes";
    }
    @RequestMapping(value = "droneTypes/findById", method = RequestMethod.GET)
    @ResponseBody
    public Optional<DroneType> findById(Long id){
        return droneTypeService.findById(id);
    }

    @RequestMapping(value="/droneTypes/update", method= {RequestMethod.PUT, RequestMethod.GET})
    public String update(DroneType location){
        droneTypeService.saveDroneType(location);
        return "redirect:/droneTypes";
    }
    @RequestMapping(value="/droneTypes/delete",
            method={RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Long id){
        droneTypeService.delete(id);
        return "redirect:/droneTypes";
    }
}

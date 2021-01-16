package com.futureDroneV5K.droneApp.controllers;

import com.futureDroneV5K.droneApp.models.Region;
import com.futureDroneV5K.droneApp.services.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class RegionController {

    @Autowired
    private RegionService regionService;

    @GetMapping("/regions")
    public String getRegion(Model model) {
        List<Region> RegionList = regionService.getRegions();
        model.addAttribute("regions", RegionList);
        return "Region";
    }
    @PostMapping("/regions/addNew")
    public String addNew(Region Region){
        regionService.saveRegion(Region);
        return "redirect:/regions";
    }
    @RequestMapping(value = "regions/findById", method = RequestMethod.GET)
    @ResponseBody
    public Optional<Region> findById(Long id){
        return regionService.findById(id);
    }

    @RequestMapping(value="/regions/update", method= {RequestMethod.PUT, RequestMethod.GET})
    public String update(Region Region){
        regionService.saveRegion(Region);
        return "redirect:/regions";
    }
    @RequestMapping(value="/regions/delete",
            method={RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Long id){
        regionService.delete(id);
        return "redirect:/regions";
    }
}
package com.futureDroneV5K.droneApp.controllers;

import com.futureDroneV5K.droneApp.models.City;
import com.futureDroneV5K.droneApp.models.Region;
import com.futureDroneV5K.droneApp.services.CityService;
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
    @Autowired
    private CityService cityService;


    @GetMapping("/regions")
    public String getRegion(Model model) {
        List<Region> regionList = regionService.getRegions();
        model.addAttribute("regions", regionList);

        List<City> cityList = cityService.getCity();
        model.addAttribute("cities", cityList);

        return "region";
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
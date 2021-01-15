package com.futureDroneV5K.droneApp.controllers;

import com.futureDroneV5K.droneApp.models.CityRegion;
import com.futureDroneV5K.droneApp.services.CityRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class CityRegionController {

    @Autowired
    private CityRegionService cityRegionService;

    @GetMapping("/cityRegions")
    public String getCityRegion(Model model) {
        List<CityRegion> cityRegionList = cityRegionService.getCityRegions();
        model.addAttribute("cityRegions", cityRegionList);
        return "cityRegion";
    }
    @PostMapping("/cityRegions/addNew")
    public String addNew(CityRegion cityRegion){
        cityRegionService.saveCityRegion(cityRegion);
        return "redirect:/cityRegions";
    }
    @RequestMapping("cityRegions/findById")
    @ResponseBody
    public Optional<CityRegion> findById(Long id){
        return cityRegionService.findById(id);
    }

    @RequestMapping(value="/cityRegions/update", method= {RequestMethod.PUT, RequestMethod.GET})
    public String update(CityRegion cityRegion){
        cityRegionService.saveCityRegion(cityRegion);
        return "redirect:/cityRegions";
    }
    @RequestMapping(value="/cityRegions/delete",
            method={RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Long id){
        cityRegionService.delete(id);
        return "redirect:/cityRegions";
    }
}
package com.futureDroneV5K.droneApp.controllers;

import com.futureDroneV5K.droneApp.models.City;
import com.futureDroneV5K.droneApp.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/cities")
    public String getCities(Model model) {
        List<City> cityList = cityService.getCities();
        model.addAttribute("cities", cityList);
        return "city";
    }
    @PostMapping("/cities/addNew")
    public String addNew(City city){
        cityService.saveCity(city);
        return "redirect:/cities";
    }
    @RequestMapping(value = "/cities/findById",
            method = RequestMethod.GET)
    @ResponseBody
    public City findById(Long id){
        return cityService.findById(id);
    }
    @RequestMapping(value="/cities/update",
            method= {RequestMethod.PUT, RequestMethod.GET})
    public String update(City city){
        cityService.saveCity(city);
        return "redirect:/cities";
    }
    @RequestMapping(value="/cities/delete",
            method={RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Long id){
        cityService.delete(id);
        return "redirect:/cities";
    }
}
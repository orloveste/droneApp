package com.futureDroneV5K.droneApp.controllers;

import com.futureDroneV5K.droneApp.models.City;
import com.futureDroneV5K.droneApp.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/cities")
    public String getCities(Model model) {
        List<City> cityList = cityService.getCity();
        model.addAttribute("cities", cityList);
        return "city";
    }
    @PostMapping("/cities/addNew")
    public String addNew(City city){
        cityService.saveCity(city);
        return "redirect:/cities";
    }
    @RequestMapping("cities/findById")
    @ResponseBody
    public Optional<City> findById(long id){
        return cityService.findById(id);
    }


//    @RequestMapping("/cities/findById")
//    @ResponseBody
//    public Optional<City> findById(Long id){
//        return cityService.findById(id);
//    }
}
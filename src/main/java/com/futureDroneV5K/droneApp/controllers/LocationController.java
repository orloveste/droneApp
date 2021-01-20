package com.futureDroneV5K.droneApp.controllers;

import com.futureDroneV5K.droneApp.models.City;
import com.futureDroneV5K.droneApp.models.Location;
import com.futureDroneV5K.droneApp.models.Region;
import com.futureDroneV5K.droneApp.services.CityService;
import com.futureDroneV5K.droneApp.services.LocationService;
import com.futureDroneV5K.droneApp.services.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class LocationController {
    @Autowired
    private LocationService locationService;
    @Autowired
    private RegionService regionService;
    @Autowired
    private CityService cityService;


    @GetMapping("/locations")
    public String getLocation(Model model) {

        List<Location> locationList = locationService.getLocations();
        model.addAttribute("locations", locationList);

        List<City> cityList = cityService.getCity();
        model.addAttribute("cities", cityList);

        List<Region> regionList = regionService.getRegions();
        model.addAttribute("regions", regionList);

        return "location";
    }
    @PostMapping("/locations/addNew")
    public String addNew(Location location){
        locationService.saveLocation(location);
        return "redirect:/locations";
    }
    @RequestMapping(value = "locations/findById", method = RequestMethod.GET)
    @ResponseBody
    public Optional<Location> findById(Long id){
        return locationService.findById(id);
    }

    @RequestMapping(value="/locations/update", method= {RequestMethod.PUT, RequestMethod.GET})
    public String update(Location location){
        locationService.saveLocation(location);
        return "redirect:/locations";
    }
    @RequestMapping(value="/locations/delete",
            method={RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Long id){
        locationService.delete(id);
        return "redirect:/locations";
    }
}

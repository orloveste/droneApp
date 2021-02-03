package com.futureDroneV5K.droneApp.controllers;

import com.futureDroneV5K.droneApp.models.Administrative;
import com.futureDroneV5K.droneApp.models.User;
import com.futureDroneV5K.droneApp.models.UserRole;
import com.futureDroneV5K.droneApp.models.UserType;
import com.futureDroneV5K.droneApp.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AdministrativeController {
    @Autowired
    private AdministrativeService administrativeService;
    @Autowired private UserTypeService userTypeService;
    @Autowired private UserRoleService userRoleService;
    @Autowired private UserService userService;
    @Autowired private CityService cityService;
    @Autowired private RegionService regionService;

    @GetMapping("/administratives")
    public String getAdministratives(Model model){
        List<Administrative> administrativeList = administrativeService.getAdministratives();
        model.addAttribute("administratives", administrativeList);
//        short version
        model.addAttribute("userTypes", userTypeService.getUserTypes());
        model.addAttribute("userRoles", userRoleService.getUserRoles());
        model.addAttribute("users", userService.getUsers());
        model.addAttribute("cities", cityService.getCities());
        model.addAttribute("regions", regionService.getRegions());

        return "/administrative";
    }
    @PostMapping("/administratives/addNew")
    public String addNew(Administrative administrative){
        administrativeService.saveAdministrative(administrative);
        return "redirect:/administratives";
    }
    @RequestMapping(value = "/administratives/findById")
    @ResponseBody
    public Administrative findById(Long id){
        return administrativeService.findById(id);
    }
    @RequestMapping(value= "/administratives/update",
            method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Administrative administrative){
        administrativeService.saveAdministrative(administrative);
        return "redirect:/administratives";
    }
    @RequestMapping(value = "/administratives/delete",
            method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Long id){
        administrativeService.delete(id);
        return "redirect:/administratives";
    }
}

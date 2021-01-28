package com.futureDroneV5K.droneApp.controllers;

import com.futureDroneV5K.droneApp.models.User;
import com.futureDroneV5K.droneApp.services.CityService;
import com.futureDroneV5K.droneApp.services.RegionService;
import com.futureDroneV5K.droneApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired private CityService cityService;
    @Autowired private RegionService regionService;

    @GetMapping("/users")
    public String getUsers(Model model){
        model.addAttribute("users", userService.getUsers());
//        model.addAttribute("cities", cityService.getCities());
//        model.addAttribute("regions", regionService.getRegions());

        return "user";
    }
    @PostMapping("/users/addNew")
    public String addNew(User user){
        userService.saveUser(user);
        return "redirect:/users";
    }
    @RequestMapping(value = "/users/findById")
    @ResponseBody
    public User findById(Long id){
        return userService.findById(id);
    }
    @RequestMapping(value= "/users/update",
            method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(User user){
        userService.saveUser(user);
        return "redirect:/users";
    }
    @RequestMapping(value = "/users/delete",
            method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Long id){
        userService.delete(id);
        return "redirect:/users";
    }
}

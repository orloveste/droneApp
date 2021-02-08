package com.futureDroneV5K.droneApp.controllers;

import com.futureDroneV5K.droneApp.services.ClientService;
import com.futureDroneV5K.droneApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
public class ProfileController {

    /*@Autowired
    private ClientService clientService;
    @RequestMapping(value = "/profile")
    public  String profile(Model model, Principal principal){
        String un = principal.getName();
        model.addAttribute("client", clientService.findByUsername(un*//*, id*//*));
        return "profile";
    }*/
    @Autowired private UserService userService;
    @RequestMapping(value = "/profile")
    public  String profile(Model model, Principal principal){
        String un = principal.getName();
        model.addAttribute("user", userService.findByUsername(un));
        return "profile";
    }
}

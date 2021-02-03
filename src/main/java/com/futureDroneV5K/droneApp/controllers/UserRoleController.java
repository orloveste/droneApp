package com.futureDroneV5K.droneApp.controllers;

import com.futureDroneV5K.droneApp.models.UserRole;
import com.futureDroneV5K.droneApp.services.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserRoleController {
    @Autowired
    private UserRoleService userRoleService;

    @GetMapping("/userRoles")
    public String getUserRole(Model model) {

        List<UserRole> userRoleList = userRoleService.getUserRoles();
        model.addAttribute("userRoles", userRoleList);

        return "userRole";
    }
    @PostMapping("/userRoles/addNew")
    public String addNew(UserRole location){
        userRoleService.saveUserRole(location);
        return "redirect:/userRoles";
    }
    @RequestMapping(value = "userRoles/findById", method = RequestMethod.GET)
    @ResponseBody
    public UserRole findById(Integer id){
        return userRoleService.findById(id);
    }

    @RequestMapping(value="/userRoles/update", method= {RequestMethod.PUT, RequestMethod.GET})
    public String update(UserRole location){
        userRoleService.saveUserRole(location);
        return "redirect:/userRoles";
    }
    @RequestMapping(value="/userRoles/delete",
            method={RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id){
        userRoleService.delete(id);
        return "redirect:/userRoles";
    }
}

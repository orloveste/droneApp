package com.futureDroneV5K.droneApp.controllers;

import com.futureDroneV5K.droneApp.models.UserType;
import com.futureDroneV5K.droneApp.services.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserTypeController {
    @Autowired
    private UserTypeService userTypeService;

    @GetMapping("/userTypes")
    public String getUserType(Model model) {

        List<UserType> userTypeList = userTypeService.getUserTypes();
        model.addAttribute("userTypes", userTypeList);

        return "userType";
    }
    @PostMapping("/userTypes/addNew")
    public String addNew(UserType location){
        userTypeService.saveUserType(location);
        return "redirect:/userTypes";
    }
    @RequestMapping(value = "userTypes/findById", method = RequestMethod.GET)
    @ResponseBody
    public UserType findById(Long id){
        return userTypeService.findById(id);
    }

    @RequestMapping(value="/userTypes/update", method= {RequestMethod.PUT, RequestMethod.GET})
    public String update(UserType location){
        userTypeService.saveUserType(location);
        return "redirect:/userTypes";
    }
    @RequestMapping(value="/userTypes/delete",
            method={RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Long id){
        userTypeService.delete(id);
        return "redirect:/userTypes";
    }
}

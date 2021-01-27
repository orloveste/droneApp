package com.futureDroneV5K.droneApp.controllers;

import com.futureDroneV5K.droneApp.models.Contact;
import com.futureDroneV5K.droneApp.services.CityService;
import com.futureDroneV5K.droneApp.services.ContactService;
import com.futureDroneV5K.droneApp.services.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ContactController {
    @Autowired
    private ContactService contactService;
    @Autowired private CityService cityService;
    @Autowired private RegionService regionService;

    @GetMapping("/contacts")
    public String getContacts(Model model){
        List<Contact> contactList = contactService.getContact();
        model.addAttribute("contacts", contactList);
//        short version
        model.addAttribute("cities", cityService.getCities());
        model.addAttribute("regions", regionService.getRegions());

        return "contact";
    }
    @PostMapping("/contacts/addNew")
    public String addNew(Contact contact){
        contactService.saveContact(contact);
        return "redirect:/contacts";
    }
    @RequestMapping(value = "/contacts/findById")
    @ResponseBody
    public Contact findById(Long id){
        return contactService.findById(id);
    }
    @RequestMapping(value= "/contacts/update",
            method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Contact contact){
        contactService.saveContact(contact);
        return "redirect:/contacts";
    }
    @RequestMapping(value = "/contacts/delete",
            method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Long id){
        contactService.delete(id);
        return "redirect:/contacts";
    }
}

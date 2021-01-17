package com.futureDroneV5K.droneApp.controllers;

import com.futureDroneV5K.droneApp.models.Client;
import com.futureDroneV5K.droneApp.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/clients")
    public String getClients(Model model){
        List<Client> clientList = clientService.getClient();
        model.addAttribute("clients", clientList);
        return "client";
    }
    @PostMapping("/clients/addNew")
    public String addNew(Client client){
        clientService.saveClient(client);
        return "redirect:/clients";
    }
    @RequestMapping(value = "/clients/findById")
    @ResponseBody
    public Client findById(Long id){
        return clientService.findById(id);
    }
    @RequestMapping(value= "/clients/update",
            method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Client client){
        clientService.saveClient(client);
        return "redirect:/clients";
    }
    @RequestMapping(value = "/clients/delete",
            method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Long id){
        clientService.delete(id);
        return "redirect:/clients";
    }
}

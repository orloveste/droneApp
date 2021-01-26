package com.futureDroneV5K.droneApp.controllers;


import com.futureDroneV5K.droneApp.models.OrderCustom;
import com.futureDroneV5K.droneApp.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;


    @GetMapping("/orders")
    public String getOrders(Model model){
        List<OrderCustom> orderCustomList = orderService.getOrders();
        model.addAttribute("orders", orderCustomList);


        return "order";
    }
    @PostMapping("/orders/addNew")
    public String addNew(OrderCustom orderCustom){
        orderService.saveOrder(orderCustom);
        return "redirect:/orders";
    }
    @RequestMapping(value = "/orders/findById")
    @ResponseBody
    public OrderCustom findById(Long id){
        return orderService.findById(id);
    }
    @RequestMapping(value= "/orders/update",
            method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(OrderCustom orderCustom){
        orderService.saveOrder(orderCustom);
        return "redirect:/orders";
    }
    @RequestMapping(value = "/orders/delete",
            method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Long id){
        orderService.delete(id);
        return "redirect:/orders";
    }
}

package com.futureDroneV5K.droneApp.controllers;


import com.futureDroneV5K.droneApp.models.Invoice;
import com.futureDroneV5K.droneApp.services.ClientService;
import com.futureDroneV5K.droneApp.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;
    @Autowired
    private ClientService clientService;

    @GetMapping("/invoices")
    public String getCities(Model model) {
        List<Invoice> invoiceList = invoiceService.getInvoice();
        model.addAttribute("invoices", invoiceList);

        model.addAttribute("clients", clientService.getClient());
        return "invoice";
    }
    @PostMapping("/invoices/addNew")
    public String addNew(Invoice invoice){
        invoiceService.saveInvoice(invoice);
        return "redirect:/invoices";
    }
    @RequestMapping(value = "/invoices/findById",
            method = RequestMethod.GET)
    @ResponseBody
    public Invoice findById(Long id){
        return invoiceService.findById(id);
    }
    @RequestMapping(value="/invoices/update",
            method= {RequestMethod.PUT, RequestMethod.GET})
    public String update(Invoice invoice){
        invoiceService.saveInvoice(invoice);
        return "redirect:/invoices";
    }
    @RequestMapping(value="/invoices/delete",
            method={RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Long id){
        invoiceService.delete(id);
        return "redirect:/invoices";
    }
}
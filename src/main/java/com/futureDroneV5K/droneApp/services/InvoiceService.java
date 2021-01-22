package com.futureDroneV5K.droneApp.services;

import com.futureDroneV5K.droneApp.models.Invoice;
import com.futureDroneV5K.droneApp.repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {
    @Autowired
    private InvoiceRepository invoiceRepository;
// autowire bean into service
    //return list of our
    public List<Invoice> getInvoice() {
        return invoiceRepository.findAll();
    }
//add new or update by id
    public void saveInvoice(Invoice invoice){
        invoiceRepository.saveAndFlush(invoice);
    }

//    getById
    public Invoice findById(Long id){//daca nu gaseste ce trebuie merge mai departe
        return invoiceRepository.findById(id).get();
    }

    public void delete(Long id) {
        invoiceRepository.deleteById(id);
    }
}

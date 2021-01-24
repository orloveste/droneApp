package com.futureDroneV5K.droneApp.services;

import com.futureDroneV5K.droneApp.models.Contact;
import com.futureDroneV5K.droneApp.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> getContact() {
        return contactRepository.findAll();
    }
    public void saveContact(Contact contact){
        contactRepository.saveAndFlush(contact);
    }
    public Contact findById(Long id){
        return contactRepository.findById(id).get();
    }
    public void delete(Long id) {
        contactRepository.deleteById(id);
    }
}

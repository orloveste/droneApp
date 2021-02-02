package com.futureDroneV5K.droneApp.services;

import com.futureDroneV5K.droneApp.models.Client;
import com.futureDroneV5K.droneApp.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;
    public List<Client> getClients() {
        return clientRepository.findAll();
    }
    public void saveClient(Client client){
        clientRepository.saveAndFlush(client);
    }
    public Client findById(Long id){
        return clientRepository.findById(id).get();
    }
    public void delete(Long id) {
        clientRepository.deleteById(id);
    }

    /*public Object findByUsername(String un, Long id) {
        return clientRepository.findById(id).get();
    }*/

    /*public Client findByUsername(String un) {
        return clientRepository.findByUsername(un);
    }*/
}

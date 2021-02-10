package com.futureDroneV5K.droneApp.services;

import com.futureDroneV5K.droneApp.models.Administrative;
import com.futureDroneV5K.droneApp.models.User;
import com.futureDroneV5K.droneApp.repositories.AdministrativeRepository;
import com.futureDroneV5K.droneApp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministrativeService {
    @Autowired
    private AdministrativeRepository administrativeRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Administrative> getAdministratives() {
        return administrativeRepository.findAll();
    }
    public void saveAdministrative(Administrative administrative){
        administrativeRepository.saveAndFlush(administrative);
    }
    public Administrative findById(Long id){
        return administrativeRepository.findById(id).get();
    }
    public void delete(Long id) {
        administrativeRepository.deleteById(id);
    }
    //set username for match first+lastName
    public void assignUsername(Long id) {
        Administrative administrative = administrativeRepository.findById(id).orElse(null);
        User user = userRepository.findUserByFirstnameAndLastname(
                administrative.getFirstname(),
                administrative.getLastname()
        );
        administrative.setUsername(user.getUsername());
        administrativeRepository.saveAndFlush(administrative);
    }
}

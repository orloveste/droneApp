package com.futureDroneV5K.droneApp.services;

import com.futureDroneV5K.droneApp.models.Administrative;
import com.futureDroneV5K.droneApp.models.Administrative;
import com.futureDroneV5K.droneApp.repositories.AdministrativeRepository;
import com.futureDroneV5K.droneApp.repositories.AdministrativeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministrativeService {
    @Autowired
    private AdministrativeRepository administrativeRepository;
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
}

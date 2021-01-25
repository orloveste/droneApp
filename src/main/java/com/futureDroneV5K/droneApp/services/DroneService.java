package com.futureDroneV5K.droneApp.services;

import com.futureDroneV5K.droneApp.models.Drone;
import com.futureDroneV5K.droneApp.repositories.DroneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DroneService {
    @Autowired
    private DroneRepository droneRepository;
    public List<Drone> getDrone() {
        return droneRepository.findAll();
    }
    public void saveDrone(Drone drone){
        droneRepository.saveAndFlush(drone);
    }
    public Drone findById(Long id){
        return droneRepository.findById(id).get();
    }
    public void delete(Long id) {
        droneRepository.deleteById(id);
    }
}

package com.futureDroneV5K.droneApp.services;

import com.futureDroneV5K.droneApp.models.DroneType;

import com.futureDroneV5K.droneApp.repositories.DroneTypeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DroneTypeService {
    @Autowired
    private DroneTypeRepository droneTypeRepository ;

    // autowire bean into service
    public List<DroneType> getDroneTypes() {
        return droneTypeRepository.findAll();
    }

    //add new or update by id
    public void saveDroneType(DroneType droneType){
        droneTypeRepository.saveAndFlush(droneType);
    }
//get
    public Optional<DroneType> findById(Long id){//daca nu gaseste ce trebuie merge mai departe
        return droneTypeRepository.findById(id);
    }

    public void delete(Long id) {
        droneTypeRepository.deleteById(id);
    }
}

package com.futureDroneV5K.droneApp.services;

import com.futureDroneV5K.droneApp.models.DroneTracker;
import com.futureDroneV5K.droneApp.repositories.DroneTrackerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DroneTrackerService {
    @Autowired
    private DroneTrackerRepository droneTrackerRepository;
    public List<DroneTracker> getDroneTracker() {
        return droneTrackerRepository.findAll();
    }
    public void saveDroneTracker(DroneTracker droneTracker){
        droneTrackerRepository.saveAndFlush(droneTracker);
    }
    public DroneTracker findById(Long id){
        return droneTrackerRepository.findById(id).get();
    }
    public void delete(Long id) {
        droneTrackerRepository.deleteById(id);
    }
}

package com.futureDroneV5K.droneApp.services;

import com.futureDroneV5K.droneApp.models.Location;
import com.futureDroneV5K.droneApp.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class LocationService {
    @Autowired
    private LocationRepository locationRepository;

    // autowire bean into service
    public List<Location> getLocations() {
        return locationRepository.findAll();
    }

    //add new or update by id
    public void saveLocation(Location location){
        locationRepository.saveAndFlush(location);
    }
//get
    public Optional<Location> findById(Long id){//daca nu gaseste ce trebuie merge mai departe
        return locationRepository.findById(id);
    }

    public void delete(Long id) {
        locationRepository.deleteById(id);
    }
}

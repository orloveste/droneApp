package com.futureDroneV5K.droneApp.services;

import com.futureDroneV5K.droneApp.models.Region;
import com.futureDroneV5K.droneApp.repositories.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegionService {
    @Autowired
    private RegionRepository regionRepository;
    // autowire bean into service
    //return list of our cityRegions
    public List<Region> getRegions() {
        return regionRepository.findAll();
    }
    //add new or update by id
    public void saveRegion(Region region){
        regionRepository.saveAndFlush(region);
    }

    public Optional<Region> findById(Long id){//daca nu gaseste ce trebuie merge mai departe
        return regionRepository.findById(id);
    }

    public void delete(Long id) {
        regionRepository.deleteById(id);
    }
}

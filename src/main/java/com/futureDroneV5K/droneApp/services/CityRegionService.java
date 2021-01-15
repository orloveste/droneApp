package com.futureDroneV5K.droneApp.services;

import com.futureDroneV5K.droneApp.models.CityRegion;
import com.futureDroneV5K.droneApp.repositories.CityRegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityRegionService {
    @Autowired
    private CityRegionRepository cityRegionRepository;
    // autowire bean into service
    //return list of our cityRegions
    public List<CityRegion> getCityRegions() {
        return cityRegionRepository.findAll();
    }
    //add new or update by id
    public void saveCityRegion(CityRegion cityRegion){
        cityRegionRepository.saveAndFlush(cityRegion);
    }

    public Optional<CityRegion> findById(Long id){//daca nu gaseste ce trebuie merge mai departe
        return cityRegionRepository.findById(id);
    }

    public void delete(Long id) {
        cityRegionRepository.deleteById(id);
    }
}

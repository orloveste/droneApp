package com.futureDroneV5K.droneApp.services;
import com.futureDroneV5K.droneApp.models.City;
import com.futureDroneV5K.droneApp.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;
// autowire bean into service
    //return list of our city
    public List<City> getCities() {
        return cityRepository.findAll();
    }
//add new or update by id
    public void saveCity(City city){
        cityRepository.saveAndFlush(city);
    }
//    getById
    public City findById(Long id){//daca nu gaseste ce trebuie merge mai departe
        return cityRepository.findById(id).get();
    }
    public void delete(Long id) {
        cityRepository.deleteById(id);
    }
}

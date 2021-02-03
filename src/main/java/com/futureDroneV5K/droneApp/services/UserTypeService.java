package com.futureDroneV5K.droneApp.services;

import com.futureDroneV5K.droneApp.models.UserType;
import com.futureDroneV5K.droneApp.repositories.UserTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTypeService {
    @Autowired
    private UserTypeRepository userTypeRepository;
    public List<UserType> getUserTypes() {
        return userTypeRepository.findAll();
    }
    public void saveUserType(UserType userType){
        userTypeRepository.saveAndFlush(userType);
    }
    public UserType findById(Long id){
        return userTypeRepository.findById(id).get();
    }
    public void delete(Long id) {
        userTypeRepository.deleteById(id);
    }
}

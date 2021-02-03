package com.futureDroneV5K.droneApp.services;

import com.futureDroneV5K.droneApp.models.UserRole;
import com.futureDroneV5K.droneApp.repositories.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleService {
    @Autowired
    private UserRoleRepository userRoleRepository;
    public List<UserRole> getUserRoles() {
        return userRoleRepository.findAll();
    }
    public void saveUserRole(UserRole userRole){
        userRoleRepository.saveAndFlush(userRole);
    }
    public UserRole findById(Integer id){
        return userRoleRepository.findById(id).get();
    }
    public void delete(Integer id) {
        userRoleRepository.deleteById(id);
    }
}

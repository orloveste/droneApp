package com.futureDroneV5K.droneApp.services;

import com.futureDroneV5K.droneApp.models.User;
import com.futureDroneV5K.droneApp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> getUsers() {
        return userRepository.findAll();
    }
    public void saveUser(User user){
        userRepository.saveAndFlush(user);
    }
    public User findById(Long id){
        return userRepository.findById(id).get();
    }
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}

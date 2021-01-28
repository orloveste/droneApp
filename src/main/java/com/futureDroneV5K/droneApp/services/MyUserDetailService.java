package com.futureDroneV5K.droneApp.services;

import com.futureDroneV5K.droneApp.models.User;

import com.futureDroneV5K.droneApp.models.UserPrincipal;
import com.futureDroneV5K.droneApp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("Mars ca nu este userul");
        }
        return new UserPrincipal(user);
    }


//    @Override
//    public UserDetails loadUserByEmail(String email) throws UsernameNotFoundException{
//        User user = userRepository.findByEmail(email);
//    }
}

package com.futureDroneV5K.droneApp.repositories;

import com.futureDroneV5K.droneApp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
//    User findByEmail(String email);
}

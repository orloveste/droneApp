package com.futureDroneV5K.droneApp.repositories;

import com.futureDroneV5K.droneApp.models.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTypeRepository extends JpaRepository<UserType, Long> {
}

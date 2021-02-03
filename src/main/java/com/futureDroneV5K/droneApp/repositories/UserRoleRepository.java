package com.futureDroneV5K.droneApp.repositories;

import com.futureDroneV5K.droneApp.models.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {
}

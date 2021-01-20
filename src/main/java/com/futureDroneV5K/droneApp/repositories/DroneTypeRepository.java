package com.futureDroneV5K.droneApp.repositories;

import com.futureDroneV5K.droneApp.models.DroneType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DroneTypeRepository extends JpaRepository<DroneType, Long> {
}

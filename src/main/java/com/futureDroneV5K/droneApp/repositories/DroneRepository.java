package com.futureDroneV5K.droneApp.repositories;

import com.futureDroneV5K.droneApp.models.Drone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DroneRepository extends JpaRepository<Drone, Long> {
}

package com.futureDroneV5K.droneApp.repositories;

import com.futureDroneV5K.droneApp.models.DroneTracker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DroneTrackerRepository extends JpaRepository<DroneTracker, Long> {
}

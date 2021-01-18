package com.futureDroneV5K.droneApp.repositories;

import com.futureDroneV5K.droneApp.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
}

package com.futureDroneV5K.droneApp.repositories;

import com.futureDroneV5K.droneApp.models.Administrative;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministrativeRepository extends JpaRepository<Administrative, Long> {
}

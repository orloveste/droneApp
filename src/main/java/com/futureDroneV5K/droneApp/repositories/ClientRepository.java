package com.futureDroneV5K.droneApp.repositories;

import com.futureDroneV5K.droneApp.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}

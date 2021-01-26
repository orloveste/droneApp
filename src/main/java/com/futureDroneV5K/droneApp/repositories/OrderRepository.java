package com.futureDroneV5K.droneApp.repositories;

import com.futureDroneV5K.droneApp.models.OrderCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderCustom, Long> {
}

package com.futureDroneV5K.droneApp.repositories;

import com.futureDroneV5K.droneApp.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}

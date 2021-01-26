package com.futureDroneV5K.droneApp.services;

import com.futureDroneV5K.droneApp.models.Order;
import com.futureDroneV5K.droneApp.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }
    public void saveOrder(Order order){
        orderRepository.saveAndFlush(order);
    }
    public Order findById(Long id){
        return orderRepository.findById(id).get();
    }
    public void delete(Long id) {
        orderRepository.deleteById(id);
    }
}

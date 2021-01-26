package com.futureDroneV5K.droneApp.services;

import com.futureDroneV5K.droneApp.models.OrderCustom;
import com.futureDroneV5K.droneApp.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    public List<OrderCustom> getOrders() {
        return orderRepository.findAll();
    }
    public void saveOrder(OrderCustom orderCustom){
        orderRepository.saveAndFlush(orderCustom);
    }
    public OrderCustom findById(Long id){
        return orderRepository.findById(id).get();
    }
    public void delete(Long id) {
        orderRepository.deleteById(id);
    }
}

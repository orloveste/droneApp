package com.futureDroneV5K.droneApp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRole {
    //generic access roles management
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer userroleid;
    private String userrolename;


//    admin,
//    user,
//    client,
//    demoAdmin,
//    demoUser,
//    demoClient
}

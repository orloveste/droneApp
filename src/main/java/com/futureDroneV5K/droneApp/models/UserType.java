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
public class UserType  {
    //generic type of users management
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long usertypeid;
    private String usertypename;
    private String photo;
    private String username;

//    admin,
//    user,
//    client,
//    demoAdmin,
//    demoUser,
//    demoClient
}

package com.futureDroneV5K.droneApp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String username;
    private String email;
    private String password;

//    @ManyToOne
//    @JoinColumn(name = "usertypeid", insertable = false,updatable = false)
//    private UserType userType;
//    private Long usertypeid;
//
//    @DateTimeFormat(pattern = "yy-MM-dd")
//    private Date useDate;

}

package com.futureDroneV5K.droneApp.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "orderid")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

//    @ManyToOne
//    @JoinColumn(name = "droneid", insertable = false, updatable = false)
//    private Drone drone;
//    private Long droneid;
//
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    private Date dateOut;
//    private String timeOut;
//
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    private Date dateIn;
//    private String timeIn;
//
//    @ManyToOne
//    @JoinColumn(name = "clientid", insertable = false, updatable = false)
//    private Client client;
//    private Long clientid;
//
//    @ManyToOne
//    @JoinColumn(name = "locationid", insertable = false, updatable = false)
//    private Location location;
//    private Long locationid;

    private String price;
    private String specifications;

}

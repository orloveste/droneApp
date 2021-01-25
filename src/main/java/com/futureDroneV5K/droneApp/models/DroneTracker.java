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
public class DroneTracker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "droneid", insertable = false, updatable = false)
    private Drone drone;
    private Long droneid;
    private String dronename;

    @ManyToOne
    @JoinColumn(name = "locationidStart", insertable = false, updatable = false)
    private Location locationStart;
    private Long locationidStart;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateStart;

    @ManyToOne
    @JoinColumn(name = "locationiEnd", insertable = false, updatable = false)
    private Location locationEnd;
    private Long locationidEnd;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateEnd;

    private String notes;
}

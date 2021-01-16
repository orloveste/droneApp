package com.futureDroneV5K.droneApp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "colationid")
    private Long locationId;

    private String description;
    private String details;
    @ManyToOne
    @JoinColumn(name = "cityid", insertable = false, updatable = false)
    private City city;
    private Long cityid;
    @ManyToOne
    @JoinColumn(name = "regionid", insertable = false, updatable = false)
    private Region region;
    private Long  regionid;
    private String address;

}

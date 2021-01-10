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
    @Column(name = "id")
    private Long locationId;

    private String description;
    private String details;
    @ManyToOne
    @JoinColumn(name = "cityId", insertable = false, updatable = false)
    private City city;
    private Long cityId;
    @ManyToOne
    @JoinColumn(name = "cityRegionId", insertable = false, updatable = false)
    private CityRegion cityRegion;
    private Long  cityRegionId;
    private String address;

}

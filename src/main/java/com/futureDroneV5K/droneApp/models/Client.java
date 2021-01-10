package com.futureDroneV5K.droneApp.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clientId")
    private Long clientId;

    private String name;
    private String address;
    private String clientCity;
    private String phone;
    private String email;

    @ManyToOne
    @JoinColumn(name = "city_id", insertable = false, updatable = false)
    private City city;
    private Long cityid;

    @ManyToOne
    @JoinColumn(name = "city_region_id", insertable = false, updatable = false)
    private CityRegion cityRegion;
    private Long cityregionid;

}

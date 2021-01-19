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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "regionid")
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long regionid;
    private String regionname;
    private String regionstreetpostalcode;

    @ManyToOne
    @JoinColumn(name = "cityid", insertable = false, updatable = false)
    private City city;
    private Long cityid;
    private String cityname;
}

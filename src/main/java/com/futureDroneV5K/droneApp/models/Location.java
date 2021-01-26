package com.futureDroneV5K.droneApp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "locationid")//?ha
    private Long locationid;

    private String description;
    private String details;
    @ManyToOne
    @JoinColumn(name = "cityid", insertable = false, updatable = false)
    private City city;
    private Long cityid;
    private String cityname;
    @ManyToOne
    @JoinColumn(name = "regionid", insertable = false, updatable = false)
    private Region region;
    private Long  regionid;
    private String regionname;

//    @OneToMany(mappedBy = "location")
//    private List<Order> orderList;
}

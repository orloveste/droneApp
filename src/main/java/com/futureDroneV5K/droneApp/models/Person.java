package com.futureDroneV5K.droneApp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Person {
    private Long id;
    private String firstName;
    private String LastName;
    private String gender;
    @ManyToOne
    @JoinColumn(name = "cityId", insertable = false, updatable = false)
    private City city;
    private Long cityId;
    @ManyToOne
    @JoinColumn(name = "cityRegionId")
    private CityRegion cityRegion;
    private Long cityRegionId;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth;
    private String address;
    private String phone;
    private String email;
    private String photo;

}

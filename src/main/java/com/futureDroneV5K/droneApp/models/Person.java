package com.futureDroneV5K.droneApp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String LastName;
    private String gender;

    @ManyToOne
    @JoinColumn(name = "cityid", insertable = false, updatable = false)
    private City city;
    private Long cityid;

    @ManyToOne
    @JoinColumn(name = "regionid", insertable = false, updatable = false)
    private Region region;
    private Long regionid;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth;

    private String address;
    private String phone;
    private String email;
    private String photo;

}

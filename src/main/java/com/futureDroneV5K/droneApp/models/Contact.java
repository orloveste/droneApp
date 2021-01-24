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
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    @ManyToOne
    @JoinColumn(name = "cityid", insertable = false, updatable = false)
    private City city;
    private Long cityid;

    @ManyToOne
    @JoinColumn(name = "regionid", insertable = false, updatable = false)
    private Region region;
    private Long regionid;

}

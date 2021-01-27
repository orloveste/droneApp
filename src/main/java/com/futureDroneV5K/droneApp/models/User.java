package com.futureDroneV5K.droneApp.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class User extends Person {


//    @ManyToOne
//    @JoinColumn(name = "usertypeid", insertable = false,updatable = false)
//    private UserType userType;
//    private Long usertypeid;
//
//    @DateTimeFormat(pattern = "yy-MM-dd")
//    private Date useDate;

}

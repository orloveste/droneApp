package com.futureDroneV5K.droneApp.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import javax.management.relation.Role;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Administrative extends Person {
//    @ManyToOne
//    @JoinColumn(name = "id", insertable = false, updatable = false)
//    private User user;
//    private Long id;
    @ManyToOne
    @JoinColumn(name = "usertypeid", insertable = false, updatable = false)
    private UserType userType;
    private Long usertypeid;
    private String photo;
    private String username;

    @ManyToOne
    @JoinColumn(name = "roleid", insertable = false, updatable = false)
    private UserRole userRole;
    private Integer userroleid;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date enrollDate;
}

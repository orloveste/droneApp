package com.futureDroneV5K.droneApp.models;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;


import java.util.Date;

import static javax.persistence.TemporalType.TIMESTAMP;

@MappedSuperclass // is not creating another table for tracking
@EntityListeners(AuditingEntityListener.class) // monitors changes in this class
public abstract class Auditable <U>{
    @CreatedBy
    protected U createdBy;
    @CreatedDate
    @Temporal(TIMESTAMP)
    protected Date createdDate;
    @LastModifiedBy
    protected U lastUpdateBy;
    @LastModifiedDate
    @Temporal(TIMESTAMP)
    protected Date lastUpdateOn;

    public U getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(U createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public U getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(U lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public Date getLastUpdateOn() {
        return lastUpdateOn;
    }

    public void setLastUpdateOn(Date lastUpdateOn) {
        this.lastUpdateOn = lastUpdateOn;
    }
}

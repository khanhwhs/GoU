package com.kloud.gou.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "TRIP", schema = "ellenMaCarPool", catalog = "")
public class RideEntity {
    private int rideId;
    private Date createdOn;
    private Integer seatsOffered;
    private Date rideStartTime;

    @Id
    @Column(name = "TRIP_ID")
    public int getRideId() {
        return rideId;
    }

    public void setRideId(int rideId) {
        this.rideId = rideId;
    }

    @Basic
    @Column(name = "CREATED_ON")
    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    @Basic
    @Column(name = "SEATS_OFFERED")
    public Integer getSeatsOffered() {
        return seatsOffered;
    }

    public void setSeatsOffered(Integer seatsOffered) {
        this.seatsOffered = seatsOffered;
    }

    @Basic
    @Column(name = "TRIP_START_TIME")
    public Date getRideStartTime() {
        return rideStartTime;
    }

    public void setRideStartTime(Date rideStartTime) {
        this.rideStartTime = rideStartTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RideEntity that = (RideEntity) o;
        return rideId == that.rideId &&
                Objects.equals(createdOn, that.createdOn) &&
                Objects.equals(seatsOffered, that.seatsOffered) &&
                Objects.equals(rideStartTime, that.rideStartTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(rideId, createdOn, seatsOffered, rideStartTime);
    }
}

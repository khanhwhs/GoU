package com.kloud.gou.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "TRIP", schema = "kqnData", catalog = "")
public class TripEntity {
    private int tripId;
    private Date createdOn;
    private Integer seatsOffered;
    private Date tripStartTime;
    private UserEntity userByUserCarId;
    private AddressEntity addressByTripDestAddrId;
    private AddressEntity addressByTripStartAddrId;

    @Id
    @Column(name = "TRIP_ID")
    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
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
    public Date getTripStartTime() {
        return tripStartTime;
    }

    public void setTripStartTime(Date tripStartTime) {
        this.tripStartTime = tripStartTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TripEntity that = (TripEntity) o;
        return tripId == that.tripId &&
                Objects.equals(createdOn, that.createdOn) &&
                Objects.equals(seatsOffered, that.seatsOffered) &&
                Objects.equals(tripStartTime, that.tripStartTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tripId, createdOn, seatsOffered, tripStartTime);
    }

    @ManyToOne
    @JoinColumn(name = "USER_CAR_ID", referencedColumnName = "USER_ID")
    public UserEntity getUserByUserCarId() {
        return userByUserCarId;
    }

    public void setUserByUserCarId(UserEntity userByUserCarId) {
        this.userByUserCarId = userByUserCarId;
    }

    @ManyToOne
    @JoinColumn(name = "TRIP_DEST_ADDR_ID", referencedColumnName = "ID")
    public AddressEntity getAddressByTripDestAddrId() {
        return addressByTripDestAddrId;
    }

    public void setAddressByTripDestAddrId(AddressEntity addressByTripDestAddrId) {
        this.addressByTripDestAddrId = addressByTripDestAddrId;
    }

    @ManyToOne
    @JoinColumn(name = "TRIP_START_ADDR_ID", referencedColumnName = "ID")
    public AddressEntity getAddressByTripStartAddrId() {
        return addressByTripStartAddrId;
    }

    public void setAddressByTripStartAddrId(AddressEntity addressByTripStartAddrId) {
        this.addressByTripStartAddrId = addressByTripStartAddrId;
    }
}

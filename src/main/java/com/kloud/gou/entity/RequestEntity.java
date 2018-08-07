package com.kloud.gou.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "REQUEST", schema = "kqnData", catalog = "")
public class RequestEntity {
    private int id;
    private Integer requesterId;
    private Date createdOn;
    private UserEntity userByRequesterId;
    private TripEntity tripByTripId;
    private AddressEntity addressByEnrouteAddr;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "REQUESTER_ID")
    public Integer getRequesterId() {
        return requesterId;
    }

    public void setRequesterId(Integer requesterId) {
        this.requesterId = requesterId;
    }

    @Basic
    @Column(name = "CREATED_ON")
    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RequestEntity that = (RequestEntity) o;
        return id == that.id &&
                Objects.equals(requesterId, that.requesterId) &&
                Objects.equals(createdOn, that.createdOn);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, requesterId, createdOn);
    }

    @ManyToOne
    @JoinColumn(name = "REQUESTER_ID", referencedColumnName = "USER_ID")
    public UserEntity getUserByRequesterId() {
        return userByRequesterId;
    }

    public void setUserByRequesterId(UserEntity userByRequesterId) {
        this.userByRequesterId = userByRequesterId;
    }

    @ManyToOne
    @JoinColumn(name = "TRIP_ID", referencedColumnName = "TRIP_ID")
    public TripEntity getTripByTripId() {
        return tripByTripId;
    }

    public void setTripByTripId(TripEntity tripByTripId) {
        this.tripByTripId = tripByTripId;
    }

    @ManyToOne
    @JoinColumn(name = "ENROUTE_ADDR", referencedColumnName = "ID")
    public AddressEntity getAddressByEnrouteAddr() {
        return addressByEnrouteAddr;
    }

    public void setAddressByEnrouteAddr(AddressEntity addressByEnrouteAddr) {
        this.addressByEnrouteAddr = addressByEnrouteAddr;
    }
}

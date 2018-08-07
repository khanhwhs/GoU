package com.kloud.gou.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "CAR", schema = "kqnData", catalog = "")
public class CarEntity {
    private int id;
    private String make;
    private String model;
    private String yearMake;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "MAKE")
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Basic
    @Column(name = "MODEL")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    @Column(name = "YEAR_MAKE")
    public String getYearMake() {
        return yearMake;
    }

    public void setYearMake(String yearMake) {
        this.yearMake = yearMake;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarEntity carEntity = (CarEntity) o;
        return id == carEntity.id &&
                Objects.equals(make, carEntity.make) &&
                Objects.equals(model, carEntity.model) &&
                Objects.equals(yearMake, carEntity.yearMake);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, make, model, yearMake);
    }
}

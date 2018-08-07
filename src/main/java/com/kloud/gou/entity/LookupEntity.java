package com.kloud.gou.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "LOOKUP", schema = "kqnData", catalog = "")
public class LookupEntity {
    private int id;
    private String lookupType;
    private String lookupDesc;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "LOOKUP_TYPE")
    public String getLookupType() {
        return lookupType;
    }

    public void setLookupType(String lookupType) {
        this.lookupType = lookupType;
    }

    @Basic
    @Column(name = "LOOKUP_DESC")
    public String getLookupDesc() {
        return lookupDesc;
    }

    public void setLookupDesc(String lookupDesc) {
        this.lookupDesc = lookupDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LookupEntity that = (LookupEntity) o;
        return id == that.id &&
                Objects.equals(lookupType, that.lookupType) &&
                Objects.equals(lookupDesc, that.lookupDesc);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, lookupType, lookupDesc);
    }
}

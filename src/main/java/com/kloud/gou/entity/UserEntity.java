package com.kloud.gou.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "User", schema = "kqnData", catalog = "")
public class UserEntity {
    private int userId;
    private String firstName;
    private String lastName;
    private String userName;
    private String userPassword;
    private String email;
    private String phoneNo;
    private String isDriverFlag;
    private String drivingLn;

    @Id
    @Column(name = "USER_ID")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "FIRST_NAME")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "LAST_NAME")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "USER_NAME")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "USER_PASSWORD")
    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Basic
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "PHONE_NO")
    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Basic
    @Column(name = "IS_DRIVER_FLAG")
    public String getIsDriverFlag() {
        return isDriverFlag;
    }

    public void setIsDriverFlag(String isDriverFlag) {
        this.isDriverFlag = isDriverFlag;
    }

    @Basic
    @Column(name = "DRIVING_LN")
    public String getDrivingLn() {
        return drivingLn;
    }

    public void setDrivingLn(String drivingLn) {
        this.drivingLn = drivingLn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return userId == that.userId &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(userPassword, that.userPassword) &&
                Objects.equals(email, that.email) &&
                Objects.equals(phoneNo, that.phoneNo) &&
                Objects.equals(isDriverFlag, that.isDriverFlag) &&
                Objects.equals(drivingLn, that.drivingLn);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userId, firstName, lastName, userName, userPassword, email, phoneNo, isDriverFlag, drivingLn);
    }
}

package com.example.SpringDataJDBC;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

@Table("OfficeDetails")
public class Office {

    @Id
    @Column("id")
    private Integer officeId;
    @Column("city")
    private String city;
    @Column("capacity")
    private int capacity;
    @Column("leaseExpiration")
    private Date leaseExpiration;

    public Office(Integer officeId, String city, int capacity, Date leaseExpiration) {
        this.officeId = officeId;
        this.city = city;
        this.capacity = capacity;
        this.leaseExpiration = leaseExpiration;
    }

    public Integer getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Integer officeId) {
        this.officeId = officeId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Date getLeaseExpiration() {
        return leaseExpiration;
    }

    public void setLeaseExpiration(Date leaseExpiration) {
        this.leaseExpiration = leaseExpiration;
    }

    @Override
    public String toString() {
        return "Office{" +
                "officeId=" + officeId +
                ", city='" + city + '\'' +
                ", capacity=" + capacity +
                ", leaseExpiration=" + leaseExpiration +
                '}';
    }
}

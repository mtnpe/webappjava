package com.mycompany.webapp.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class SalesOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private Date date;
    @Column
    private int customerId;
    @Column
    private int warehouseId;
    @Column
    private String description;

    public SalesOrder(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

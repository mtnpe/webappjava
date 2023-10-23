package com.mycompany.webapp.entities;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "purchase_order")
public class PurchaseOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private Date date;
    @Column(name = "supplier_id")
    private int supplierId;
    @Column(name = "warehouse_id")
    private int warehouseId;
    private String description;

    public PurchaseOrder(){}

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

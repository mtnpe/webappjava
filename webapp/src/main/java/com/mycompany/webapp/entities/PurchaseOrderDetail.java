package com.mycompany.webapp.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "purchase_order_detail")
public class PurchaseOrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int orderId;
    @Column
    private int productId;
    @Column
    private int quantity;
    @Column(name = "unit_price")
    private long unitPrice;

    public  PurchaseOrderDetail(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(long unitPrice) {
        this.unitPrice = unitPrice;
    }
}

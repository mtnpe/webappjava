package com.mycompany.webapp.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "warehouse")
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String address;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name= "warehouse_keeper_id",  referencedColumnName = "id")
    private WarehouseKeeper warehouseKeeper;

    public Warehouse(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public WarehouseKeeper getWarehouseKeeper() {
        return warehouseKeeper;
    }

    public void setWarehouseKeeper(WarehouseKeeper warehouseKeeper) {
        this.warehouseKeeper = warehouseKeeper;
    }
}

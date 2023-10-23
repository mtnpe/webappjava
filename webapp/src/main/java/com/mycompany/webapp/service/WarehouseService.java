package com.mycompany.webapp.service;

import com.mycompany.webapp.entities.Warehouse;
import com.mycompany.webapp.repositories.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseService {
    @Autowired
    private WarehouseRepository warehouseRepository;

    public List<Warehouse> getListWarehouse(){
//        System.out.println("------------------------");
//        System.out.println(warehouseRepository.findById(1).getWarehouseKeeper().getName());
        return warehouseRepository.findAll();
    }

}

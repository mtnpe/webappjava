package com.mycompany.webapp.controller;

import com.mycompany.webapp.entities.Warehouse;
import com.mycompany.webapp.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WarehouseController {

    @Autowired
    private WarehouseService warehouseService;

    @GetMapping(path = "/list-warehouse")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Warehouse> getListWarehouse(){
        return warehouseService.getListWarehouse();
    }
}

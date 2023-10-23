package com.mycompany.webapp.controller;

import com.mycompany.webapp.entities.WarehouseKeeper;
import com.mycompany.webapp.service.WarehouseKeeperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Service
public class WarehouseKeeperController {
    @Autowired
    private WarehouseKeeperService warehouseKeeperService;

    @GetMapping(path = "/list-warehouse-keeper")
    @ResponseStatus(code = HttpStatus.OK)
    public List<WarehouseKeeper> getListWarehouseKeeper(){
        return warehouseKeeperService.getListWarehouseKeeper();
    }
}

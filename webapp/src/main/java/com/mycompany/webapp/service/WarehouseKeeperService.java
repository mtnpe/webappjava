package com.mycompany.webapp.service;

import com.mycompany.webapp.entities.WarehouseKeeper;
import com.mycompany.webapp.repositories.WarehouseKeeperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseKeeperService {
    @Autowired
    private WarehouseKeeperRepository warehouseKeeperRepository;

    public List<WarehouseKeeper> getListWarehouseKeeper(){
        return warehouseKeeperRepository.findAll();
    }
}

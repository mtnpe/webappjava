package com.mycompany.webapp.service;

import com.mycompany.webapp.entities.Supplier;
import com.mycompany.webapp.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {
    @Autowired
    private SupplierRepository supplierRepository;

    public List<Supplier> getListSupplier(){
        return supplierRepository.findAll();
    }
}

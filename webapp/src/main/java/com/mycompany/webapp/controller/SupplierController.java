package com.mycompany.webapp.controller;

import com.mycompany.webapp.entities.Supplier;
import com.mycompany.webapp.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SupplierController {
    @Autowired
    private SupplierService supplierService;

    @GetMapping(path = "/list-supplier")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Supplier> getListSupplier(){
        return supplierService.getListSupplier();
    }
}

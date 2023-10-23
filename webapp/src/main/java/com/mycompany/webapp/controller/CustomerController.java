package com.mycompany.webapp.controller;

import com.mycompany.webapp.entities.Customer;
import com.mycompany.webapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping (path = "/list-customer")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Customer> getListCustomer(){
        return customerService.getListCustomer();
    }

    @PostMapping(path = "/add-customer")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void addCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);
    }
}

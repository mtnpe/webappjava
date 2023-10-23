package com.mycompany.webapp.controller;

import com.mycompany.webapp.entities.Product;
import com.mycompany.webapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping(path = "/list-product")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Product> getListProduct(){
        return productService.getListProduct();
    }
}

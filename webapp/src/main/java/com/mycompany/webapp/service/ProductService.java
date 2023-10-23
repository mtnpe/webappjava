package com.mycompany.webapp.service;

import com.mycompany.webapp.entities.Product;
import com.mycompany.webapp.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getListProduct(){
        return productRepository.findAll();
    }
}

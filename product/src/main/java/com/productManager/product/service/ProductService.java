package com.productManager.product.service;

import com.productManager.product.domain.Product;
import com.productManager.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> listProduct() {
        return repository.findAll();
    }
}
package com.productManager.product.controller;

import com.productManager.product.domain.Product;
import com.productManager.product.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/product")
public class ProductController {

    @Autowired
    private ProductService service;

    // Build Get All Users REST API
    // http://localhost:8080/api/product
    @GetMapping
    public ResponseEntity<List<Product>> getAll(){
        List<Product> products = service.getAll();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

}
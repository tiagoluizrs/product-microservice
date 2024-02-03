package com.productManager.product.service;

import com.productManager.product.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List <Product> getAll();

    Product get(Long id);

    void save(Product product);

    void update(Product product);

    void delete(Long id);
}

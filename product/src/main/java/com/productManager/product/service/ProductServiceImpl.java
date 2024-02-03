package com.productManager.product.service;

import com.productManager.product.domain.Product;
import com.productManager.product.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@AllArgsConstructor
@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository repository;

    @Override
    public List<Product> getAll() {
        return repository.findAll();
    }

    @Override
    public Product get(Long id){
        return repository.findById(id).orElseThrow(() -> new NoSuchElementException("Produto não encontrado com o ID: " + id));
    }

    @Override
    public void save(Product product){
        repository.save(product);
    }

    @Override
    public void update(Product product){
        repository.save(product);
    }

    @Override
    public void delete(Long id){
        repository.deleteById(id);
    }
}
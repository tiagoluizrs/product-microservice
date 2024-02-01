package com.productManager.product.service;

import com.productManager.product.domain.Product;
import com.productManager.product.mapper.ProductMapper;
import com.productManager.product.openapi.api.ProductApiDelegate;
import com.productManager.product.openapi.model.ProductRepresentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductApiDelegateImpl implements ProductApiDelegate {
    private final ProductService productService;
    private final ProductMapper mapper;

    @Autowired
    public ProductApiDelegateImpl(ProductService productService, ProductMapper mapper) {
        this.productService = productService;
        this.mapper = mapper;
    }

    @Override
    public ResponseEntity<List<ProductRepresentation>> listProduct() {
        List<Product> products = productService.listProduct();
        return ResponseEntity.ok(mapper.toRepresentationList(products));
    }
}
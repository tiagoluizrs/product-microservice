package com.productManager.product.controller;

import com.productManager.product.domain.Product;
import com.productManager.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

  @Autowired
  private ProductService productService;

  @GetMapping("/product")
  public List<Product> listProduct() {
    return productService.listAllProducts();
  }
}

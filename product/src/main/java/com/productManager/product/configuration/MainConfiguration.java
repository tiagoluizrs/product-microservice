package com.productManager.product.configuration;

import com.productManager.product.mapper.ProductMapper;
import com.productManager.product.openapi.api.ProductApiDelegate;
import com.productManager.product.service.ProductApiDelegateImpl;
import com.productManager.product.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MainConfiguration {

    @Bean
    @Primary
    public ProductApiDelegate productApiDelegate(ProductService productService, ProductMapper mapper) {
        return new ProductApiDelegateImpl(productService, mapper);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
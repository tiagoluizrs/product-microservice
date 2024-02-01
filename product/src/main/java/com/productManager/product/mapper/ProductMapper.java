package com.productManager.product.mapper;

import com.productManager.product.domain.Product;
import com.productManager.product.openapi.model.ProductRepresentation;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductMapper {

    private final ModelMapper modelMapper = new ModelMapper();

    public ProductRepresentation toRepresentation(Product product) {
        return modelMapper.map(product, ProductRepresentation.class);
    }

    public Product toModel(ProductRepresentation product) {
        return modelMapper.map(product, Product.class);
    }

    public List<ProductRepresentation> toRepresentationList(List<Product> products) {
        return products.stream()
                .map(product -> modelMapper.map(product, ProductRepresentation.class))
                .collect(Collectors.toList());
    }

    public List<Product> toModelList(List<ProductRepresentation> representations) {
        return representations.stream()
                .map(representation -> modelMapper.map(representation, Product.class))
                .collect(Collectors.toList());
    }
}

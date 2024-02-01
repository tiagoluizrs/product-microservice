package com.productManager.product.service;

import com.productManager.product.domain.Product;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductService {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public Product saveProduct(Product product) {
        if (product.getId() == null) {
            em.persist(product);
            return product;
        } else {
            return em.merge(product);
        }
    }

    public Product findProductById(Integer id) {
        return em.find(Product.class, id);
    }

    public List<Product> listAllProducts() {
        return em.createQuery("SELECT p FROM Product p", Product.class).getResultList();
    }
}

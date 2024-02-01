package com.productManager.product.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "Product")
@Entity
@Getter
@Setter
public class Product {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;
}

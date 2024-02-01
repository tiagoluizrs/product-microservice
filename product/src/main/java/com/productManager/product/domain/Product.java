package com.productManager.product.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "product")
public class Product {
  @Id
  private Integer id;

  @Column(name = "name")
  String name;
}
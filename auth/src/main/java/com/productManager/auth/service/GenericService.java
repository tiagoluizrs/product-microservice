package com.productManager.auth.service;

import jakarta.persistence.Entity;

import java.util.List;

public interface GenericService<T> {
    List<T> getAll();

    T get(Long id, String noSuchElementException);

    void save(T product);

    void update(T product);

    void delete(Long id);
}

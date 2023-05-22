package com.leandro.project.payGoal.service.implementation;

import com.leandro.project.payGoal.models.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(Product product);
    Product updateProduct(Product product);
    Product getProductById(Long id);
    Product getProductByName(String name);
    void deleteProduct(Long id);
    List<Product> getAllProductsSortedByPrice();
}

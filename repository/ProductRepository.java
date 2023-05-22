package com.leandro.project.payGoal.repository;

import com.leandro.project.payGoal.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByNombre(String nombre);
}

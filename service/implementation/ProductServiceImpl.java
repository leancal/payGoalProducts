package com.leandro.project.payGoal.service.implementation;

import com.leandro.project.payGoal.models.Product;
import com.leandro.project.payGoal.repository.ProductRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements com.leandro.project.payGoal.service.implementation.ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product getProductByName(String name) {
        return productRepository.findByNombre(name);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> getAllProductsSortedByPrice() {
        return productRepository.findAll(Sort.by(Sort.Direction.ASC, "precio"));
    }
}

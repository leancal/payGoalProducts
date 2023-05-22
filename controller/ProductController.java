package com.leandro.project.payGoal.controller;

import com.leandro.project.payGoal.models.Product;
import com.leandro.project.payGoal.service.implementation.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
        Product existingProduct = productService.getProductById(id);
        if (existingProduct != null) {
            product.setId(id);
            return productService.updateProduct(product);
        }
        return null;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @GetMapping
    public Product getProductByName(@RequestParam String name) {
        return productService.getProductByName(name);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }

    @GetMapping("/sorted")
    public List<Product> getAllProductsSortedByPrice() {
        return productService.getAllProductsSortedByPrice();
    }
}

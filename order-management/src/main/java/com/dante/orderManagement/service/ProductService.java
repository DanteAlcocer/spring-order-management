package com.dante.orderManagement.service;

import com.dante.orderManagement.model.Product;
import com.dante.orderManagement.dto.ProductDTO;
import org.springframework.stereotype.Service;


import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ProductService {
    // Simulador de Base de Datos en memoria
    private final Map<Long, Product> products = new HashMap<>();
    private final AtomicLong counter = new AtomicLong(1);

    public List<Product> getAllProducts() {
        return new ArrayList<>(products.values());
    }

    public Product createProduct(ProductDTO dto) {
        Product product = new Product(counter.getAndIncrement(), dto.name(), dto.price());
        products.put(product.getId(), product);
        return product;
    }

    public Product updateProduct(Long id, ProductDTO dto) {
        if (products.containsKey(id)) {
            Product product = new Product(id, dto.name(), dto.price());
            products.put(id, product);
            return product;
        }
        return null;
    }

    public boolean deleteProduct(Long id) {
        return products.remove(id) != null;
    }
}
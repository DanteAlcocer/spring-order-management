package com.dante.ordermanagement.service;

import com.dante.ordermanagement.dto.ProductDTO;
import com.dante.ordermanagement.model.Product;
import com.dante.ordermanagement.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    // Inyectamos el repositorio
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll(); // Busca todo en la BD
    }

    public Product createProduct(ProductDTO dto) {
        // El ID no se envía, Postgres lo genera solo gracias a GenerationType.IDENTITY
        Product product = new Product(null, dto.name(), dto.price());
        return productRepository.save(product); // Guarda en la BD
    }

    public Product updateProduct(Long id, ProductDTO dto) {
        return productRepository.findById(id)
                .map(existingProduct -> {
                    existingProduct.setName(dto.name());
                    existingProduct.setPrice(dto.price());
                    return productRepository.save(existingProduct);
                })
                .orElse(null); // Si no existe el ID, retorna null (el controlador manejará el 404)
    }

    public boolean deleteProduct(Long id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
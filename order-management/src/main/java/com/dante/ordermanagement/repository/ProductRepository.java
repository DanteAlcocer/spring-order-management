package com.dante.ordermanagement.repository;

import com.dante.ordermanagement.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Aquí ya heredamos métodos como: save(), findAll(), findById(), deleteById()
}
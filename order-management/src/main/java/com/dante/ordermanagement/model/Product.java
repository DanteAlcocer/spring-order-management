package com.dante.ordermanagement.model;

import jakarta.persistence.*;

@Entity
@Table(name = "products") // Nombre de la tabla en Postgres
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID Autoincremental en Postgres (Serial/Identity)
    private Long id;

    @Column(nullable = false) // No permite valores nulos
    private String name;

    @Column(nullable = false)
    private Double price;

    // IMPORTANTE: JPA requiere un constructor vacío obligatorio
    public Product() {
    }

    public Product(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Mantén tus Getters y Setters aquí abajo...
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
}
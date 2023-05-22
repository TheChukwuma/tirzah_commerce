package com.tirzah.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Table(name = "products")
@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private String category;
    private BigDecimal price;
    private String image;
    private String status;
    private String uuid;
    private boolean isDeleted;
    private boolean isFeatured;
    private boolean isOnSale;
    private boolean isBestSeller;


}

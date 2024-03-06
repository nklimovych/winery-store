package com.petervine.winerystore.model;

import jakarta.persistence.*;
import lombok.ToString;

import java.util.Set;

@Entity
@Table(name = "products")
@ToString
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "product_type_id")
    private ProductType productType;
    @Column
    private String title;
    @Column
    private Double volume;
    @Column
    private Integer year;
    @Column
    private Double price;
    @Column
    private Double alcoholPercentage;
    @ManyToOne
    @JoinColumn(name = "grapeSortId")
    private GrapeSort grapeSort;
    @Column
    private String description;
    @ManyToMany(mappedBy = "productSet")
    Set<Order> orderSet;
}

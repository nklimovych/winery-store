package com.petervine.winerystore.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Сік або вино
@Entity
@Table(name = "product_types")
public class ProductType {
    @Id
    private Integer id;
    @Column
    private String title;
}

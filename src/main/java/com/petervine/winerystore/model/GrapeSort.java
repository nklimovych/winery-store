package com.petervine.winerystore.model;

import jakarta.persistence.*;

@Entity
@Table(name = "grape_sorts")
public class GrapeSort {
    @Id
    private Integer id;
    @Column
    private String sortName;
}

package com.petervine.winerystore.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
@Entity
public class Customer {

    @Id
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private String email;
    @Column
    private String phoneNumber;
    @Column
    private String companyName;
    //Як писати поле з доставкою
    @Column
    private String deliveryType;
    @Column
    private String deliveryAddress;

}

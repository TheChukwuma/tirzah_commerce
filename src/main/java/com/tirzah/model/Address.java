package com.tirzah.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "addresses")
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer houseNo;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    @OneToOne(mappedBy = "address")
    private User user;

}

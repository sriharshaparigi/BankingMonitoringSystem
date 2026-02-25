package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "ACCOUNT")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String accountNumber;
    private String customerName;
    private String email;
    private double balance;

}

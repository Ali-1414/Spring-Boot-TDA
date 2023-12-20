package com.example.model;

import jakarta.persistence.*;

public class Statement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn
    private Account account;

    private String datefield;
    private String amount;
}

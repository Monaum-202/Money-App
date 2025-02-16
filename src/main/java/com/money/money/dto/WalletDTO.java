package com.money.money.dto;

import java.util.List;

public class WalletDTO {
    private Long id;
    private String name;
    private Double balance;
    private Long userId; // Only storing user ID to avoid exposing full User entity

    // Constructors
    public WalletDTO() {}

    public WalletDTO(Long id, String name, Double balance, Long userId) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.userId = userId;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
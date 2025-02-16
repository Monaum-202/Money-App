package com.money.money.dto;


import com.money.money.enums.TransactionType;

public class CategoryDTO {
    private Long id;
    private String name;
    private TransactionType type; // INCOME or EXPENSE
    private Long userId; // Only sending user ID instead of entire User entity

    // Constructors
    public CategoryDTO() {}

    public CategoryDTO(Long id, String name, TransactionType type, Long userId) {
        this.id = id;
        this.name = name;
        this.type = type;
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

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}

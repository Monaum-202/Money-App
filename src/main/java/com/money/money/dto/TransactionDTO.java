package com.money.money.dto;


import com.money.money.enums.TransactionType;
import java.time.LocalDate;

public class TransactionDTO {
    private Long id;
    private Double amount;
    private String description;
    private TransactionType type;  // INCOME or EXPENSE
    private LocalDate date;
    private Long categoryId;
    private Long walletId;

    public TransactionDTO() {
    }

    public TransactionDTO(Long id, Double amount, String description, TransactionType type, LocalDate date, Long categoryId, Long walletId) {
        this.id = id;
        this.amount = amount;
        this.description = description;
        this.type = type;
        this.date = date;
        this.categoryId = categoryId;
        this.walletId = walletId;
    }

    // Getters and Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getWalletId() {
        return walletId;
    }

    public void setWalletId(Long walletId) {
        this.walletId = walletId;
    }
}

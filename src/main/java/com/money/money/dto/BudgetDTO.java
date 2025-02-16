package com.money.money.dto;

import java.time.LocalDate;

public class BudgetDTO {
    private Long id;
    private Double limitAmount;
    private LocalDate startDate;
    private LocalDate endDate;
    private Long userId;      // Only sending user ID, not the entire User entity
    private Long categoryId;  // Only sending category ID

    // Constructors
    public BudgetDTO() {}

    public BudgetDTO(Long id, Double limitAmount, LocalDate startDate, LocalDate endDate, Long userId, Long categoryId) {
        this.id = id;
        this.limitAmount = limitAmount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.userId = userId;
        this.categoryId = categoryId;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(Double limitAmount) {
        this.limitAmount = limitAmount;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}

package com.money.money.dto;

import com.money.money.enums.RecurringInterval;

import java.time.LocalDate;

public class RecurringTransactionDTO {
    private Long id;
    private Double amount;
    private String description;
    private RecurringInterval interval;  // DAILY, WEEKLY, MONTHLY, YEARLY
    private LocalDate startDate;
    private Long categoryId;
    private Long walletId;

    // Getters and Setters
}
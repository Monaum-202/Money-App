package com.money.money.entity;

import com.money.money.enums.RecurringInterval;
import com.money.money.enums.TransactionType;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "recurring_transactions")
public class RecurringTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    @Enumerated(EnumType.STRING)
    private TransactionType type; // INCOME or EXPENSE

    @Enumerated(EnumType.STRING)
    private RecurringInterval interval; // DAILY, WEEKLY, MONTHLY, YEARLY

    private LocalDateTime nextExecutionDate;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "wallet_id", nullable = false)
    private Wallet wallet;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
}
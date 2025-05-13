package com.kata.bank;

import java.time.LocalDate;

// Transaction class represents the date, amount, balance, and transaction type
public class Transaction {
    private final LocalDate date;
    private final int amount;
    private final int balanceAfter;
    private final TransactionType type;

    public Transaction(LocalDate date, int amount, int balanceAfter, TransactionType type) {
        this.date = date;
        this.amount = amount;
        this.balanceAfter = balanceAfter;
        this.type = type
    }

    public LocalDate getDate() {
        return date;
    }
    public int getAmount() {
        return amount;
    }
    public int getBalanceAfter() {
        return balanceAfter;
    }
    public TransactionType getType() {
        return type;
    }
  
}

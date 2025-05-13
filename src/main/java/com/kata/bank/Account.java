package com.kata.bank;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
  // Class Transaction manages deposits, withdrawals, and statements  
public class Account {
    private final List <Transaction> transactions = new ArrayList<>();
    private int balance = 0;

    public void deposit(int amount) {
      balance += amount;
      transactions.add(new Transaction(LocalDate.now(), amount, balance, TransactionType.DEPOSIT));
    }

    public void withdrawal(int amount) {
      if(amout > balance) {
         throw new IllegalArgumentException("you have no balance in your account");
      }
      balance -=amout;
      transactions.add(new Transaction(LocalDate.now(), -amount, balance, TransactionType.WITHDRAWAL));
    }

    public void printStatement() {
      System.out.println("DATE  | TYPE  |  AMOUNT  |  BALANCE");
      for(Transaction tr: transactions) {
        System.out.println(
          t.getDate() + "  |  "+
          t.getType() + "  |  "+
          t.getAmount() + "  |  "+
          t.getBalanceAfter()
          );
      }
      if (balance == 0) {
        System.out.println("Your balance is 0");
      }
    }
   public int getBalance() {
     return balance;
   }
}

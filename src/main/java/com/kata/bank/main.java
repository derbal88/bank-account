package com.kata.bank;

public class Main {
  public static void main(String[] args) {
    Account account = new Account();
    account.deposit(1000);
    account.withdrawal(300);
    account.withdrawal(700); // new balance 0
    account.printStatement();
  }
}

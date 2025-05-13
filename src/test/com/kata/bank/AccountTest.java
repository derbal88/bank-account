package com.kata.bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
  private Account account;

  @BeforeEach
  void setUp(){
    account = new Account();
  }

  @Test
  void testDeposit() {
    account.deposit(500);
    assertEquals(500, account.getBalance());
  }

  @Test
  void testWithdrawalFound(){
    account.deposit(1000);
    account.withdrawal(400);
    assertEquals(600, account.getBalance());
  }

  @Test
  void testWithdrawal_moreThanBalance(){
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
      account.withdrawal(4000);
    });
    assertEquals("you have no balance in your account", exception.getMessage());
  }
}

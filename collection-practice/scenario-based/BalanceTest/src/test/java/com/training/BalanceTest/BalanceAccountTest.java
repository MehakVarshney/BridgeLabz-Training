package com.training.BalanceTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BalanceAccountTest {

	BankAccount bankAccount;

	@BeforeEach
	public void setUp() {
		bankAccount = new BankAccount();
	}

	@Test
	public void Test_Deposit_ValidAmount() throws Exception {
		bankAccount.Deposit(500);
		Assertions.assertEquals(500, bankAccount.getBalance());
	}

	@Test
	public void Test_Deposit_NegativeAmount() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> bankAccount.Deposit(-100));
	}

	@Test
	public void Test_Withdraw_ValidAmount() throws Exception {
		bankAccount.Deposit(500);
		bankAccount.Withdraw(400);
		Assertions.assertEquals(100, bankAccount.getBalance());
	}

	@Test
	public void Test_Withdraw_InsufficientFunds() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> bankAccount.Withdraw(100));
	}
}

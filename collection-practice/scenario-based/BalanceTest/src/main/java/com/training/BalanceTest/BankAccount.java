package com.training.BalanceTest;

public class BankAccount {
	private double balance = 0.0;
	
	public void Deposit(double amount) throws Exception {
		if(balance < 0) {
			throw new IllegalArgumentException("Balance must be postive");
		} else if(amount < 0) {
			throw new IllegalArgumentException("Deposit amount cannot be negative");
		}
		
		balance += amount;
	}
	
	public void Withdraw(double amount) throws Exception {
		if(amount > balance) {
			throw new IllegalArgumentException("Insufficient Funds");
		}
		balance -= amount;
	}
	
	public double getBalance() {
		return balance;
	}
}

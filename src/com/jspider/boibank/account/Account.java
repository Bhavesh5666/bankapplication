package com.jspider.boibank.account;

public class Account {

	int accountBalance;

	public Account(int accountBalance) {
		super();
		this.accountBalance = accountBalance;
	}

	 public synchronized  void  deposite(int depositeAmont) {
		
		System.out.println("Deposting " + depositeAmont + " ruppes in your account");
		accountBalance += depositeAmont;
		System.out.println("available balance is " + accountBalance);
		
	}
	
	public synchronized void withdraw(int withdrawAmount) {
		
		System.out.println("withdrawing " + withdrawAmount + " ruppes from your account");
		accountBalance -= withdrawAmount;
		System.out.println("available balance is " + accountBalance);
		
	}
	

}

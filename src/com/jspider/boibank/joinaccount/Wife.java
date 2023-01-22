package com.jspider.boibank.joinaccount;

import com.jspider.boibank.account.Account;

public class Wife extends Thread{
	
	Account account;

	public Wife(Account account) {
		super();
		this.account = account;
	}
	

	@Override
	public void run() {
		account.deposite(10000);
		account.withdraw(3000);
	}
}

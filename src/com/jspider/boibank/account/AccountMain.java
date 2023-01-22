package com.jspider.boibank.account;

import com.jspider.boibank.joinaccount.Husband;
import com.jspider.boibank.joinaccount.Wife;

public class AccountMain {
	public static void main(String[] args) {
		
		Account account = new Account(10000);
		
		Husband husband = new Husband(account);
		Wife wife = new Wife(account);
		
		husband.start();
		wife.start();
	}

}

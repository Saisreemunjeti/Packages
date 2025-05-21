package com.bank.app;

import com.bank.accounts.BankAccount;
import com.bank.customers.Customer;

public class BankApp {
	public static void main(String[] args) {
		BankAccount Ba=new BankAccount();
		Ba.setAccountNumber("45876");
		Ba.setBalance(234522);
		Customer customer=new Customer();
		customer.setCustomerID(7894);
		customer.setCustomerName("Karthik");
		Ba.showAccountDetails();
		customer.showCustomerDetails();
		}
	
	
}

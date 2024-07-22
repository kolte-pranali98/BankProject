package com.tka.example;

import java.util.HashMap;

public class Bank {


	public static final String bankName="SBI";
	private static HashMap<String,Account>bankDB=new HashMap<>();
	
	//creating bank database using hashmap object
	public Bank() {
		this.bankDB=new HashMap<>();
	}
	
	//create new bank account and store into bankdb.
	
	public static void createNewAccount(String accountHolderName,String accountNumber,double balance ,AdharCard adharcard,PanCard pancard, String phoneNumber)
	{
		Account account =new Account(accountHolderName,accountNumber,balance,phoneNumber,adharcard,pancard);
		
				//adding account object to bankdb map 
				bankDB.put(accountNumber, account);
	}
	// remove existing account from bankDB.
	public static void removeAccount(String accountNumber) {
		if(bankDB.containsKey(accountNumber)) {
			bankDB.remove(accountNumber);
		}
		else {
			System.out.println("Account with A/c NO: "+accountNumber+" is not found in database");
		}
		System.out.println("Thank you for using  our bank "+bankName);
		System.out.println("your Account is deleted successfully with A/c no "+accountNumber);
	}
	//getting  single  account frm bank database.
	public static Account getAccount(String accountNumber) {
		Account account=null;
		if(bankDB.containsKey(accountNumber)) {
			account=bankDB.get(accountNumber);
		}
		return account;
	}
	
}

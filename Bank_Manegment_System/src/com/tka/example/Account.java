package com.tka.example;

public class Account {

	private String accountHolderName;
	private String accountNumber;
	private double balance;
	private String phoneNumber;
	private AdharCard adharcard;
	private PanCard pancard;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String accountHolderName, String accountNumber, double balance, String phoneNumber,
			AdharCard adharcard, PanCard pancard) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.phoneNumber = phoneNumber;
		this.adharcard = adharcard;
		this.pancard = pancard;
	}

	
	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public AdharCard getAdharcard() {
		return adharcard;
	}

	public void setAdharcard(AdharCard adharcard) {
		this.adharcard = adharcard;
	}

	public PanCard getPancard() {
		return pancard;
	}

	public void setPanacrd(PanCard pancard) {
		this.pancard = pancard;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			this.balance = this.balance + amount;
		}
		System.out.println("your account " + accountNumber + " is created with amount " + amount);
		System.out.println("Total Balance is :  " + balance);
	}

	public void withdraw(double amount) {
		if (amount < this.balance) {
			this.balance = balance - amount;
			System.out.println("your Account " + accountNumber + " is debited with amount " + amount);
		} else {
			System.out.println("sorry can not process insufficient balance!!!!");
		}
	}

	public void checkBalance() {
		System.out.println("Your A/c No " + accountNumber);
		System.out.println("Avl balance is " + balance);
	}

	public void getAccountHolderInformation() {
		System.out.println("---------------AccountHolderInformation---------------");
		System.out.println("Account Holder Name: " + this.accountHolderName);
		System.out.println("A/c number: " + this.accountNumber);
		System.out.println("A/c AVL Balance: " + this.balance);
		System.out.println("Account holder contact phone num: " + this.phoneNumber);

		System.out.println("***********************Adhar Card Details***********************");
		System.out.println("name: " + adharcard.getMyname());
		System.out.println("DOB: " + adharcard.getDob());
		System.out.println("adhar card Number: " + adharcard.getAdharNum());
		System.out.println(" Address: " + adharcard.getAddress());
		System.out.println("***********************Pan card Details***********************");

		System.out.println("Name: " + pancard.getName());
		System.out.println("pan card Number: " + pancard.getPanNum());
		System.out.println("pan card Dob: " + pancard.getDob());
		System.out.println("_______________________________________________________________");

	}

}

package com.tka.example;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("*******WEL COME TO "+Bank.bankName+"************");
		
		
		while(true) {
			System.out.println("1: create New Account");
			System.out.println("2: cheack balance");
			System.out.println("3: Deposit ");
			System.out.println("4: Withdraw");
			System.out.println("5: Account Holder information");
			System.out.println("6: Delete Bank Account");
			System.out.println("7: Exit");
			
			System.out.println();
			
			System.out.println("Enter your choice: ");
			int choice=sc.nextInt();
			sc.nextLine();
			
			if(choice==1) {
				System.out.println("Enter Account Holder Name: ");
				String name=sc.nextLine();
				
				System.out.println("Enter account Number: ");
				String accountNumber=sc.nextLine();
				
				System.out.println("Enter Account to Deposit: ");
				double amount=sc.nextDouble();
				
				System.out.println("Enter phone Number: ");
				String phoneNumber=sc.nextLine();
				
				System.out.println("Enter address");
				String address=sc.nextLine();
				
				System.out.println("Enter DOB");
				String dob=sc.nextLine();
				
				System.out.println("Enter Adhar Number");
				String adharNumber=sc.nextLine();
				
				System.out.println("Enter pan Number");
                 String panNumber=sc.nextLine();
                 
                 System.out.println();

			AdharCard adharcard=new AdharCard(name, address,dob,adharNumber);
			PanCard pancard=new PanCard(name,dob,panNumber);
			
			Bank.createNewAccount(name, accountNumber, amount, adharcard, pancard, phoneNumber);
			}
			else if(choice==2){
				
				System.out.println("Enter Account Number: ");
				String accountNumber=sc.nextLine();
				try {
					Account account=Bank.getAccount(accountNumber);
					account. checkBalance();
				}
				catch(Exception e) {
					System.out.println("A/c not found");
				}
			}
			else if(choice==3) {
				System.out.println("Enter Account Number");
				String accountNumber=sc.nextLine();
				
				System.out.println("Enter amount to deposit");
				double amount=sc.nextDouble();
				
				try {
					Account account =Bank.getAccount(accountNumber);
					account.deposit(amount);
					
				}catch(Exception e) {
					System.out.println("A/c not found");
				}
			}
			else if(choice==4) {
				System.out.println("Enter Account Number: ");
				String accountNumber=sc.nextLine();
				
				System.out.println("Enter amount to withdraw");
				double amount=sc.nextDouble();
				
				try {
					Account account=Bank.getAccount(accountNumber);
					account.withdraw(amount);
				}catch(Exception e) {
					System.out.println("A/c not found");
				}
			}
			else if(choice==5) {
				System.out.println("Enter Account Number: ");
				String accountNumber=sc.nextLine();
				try {
					Account account=Bank.getAccount(accountNumber);
					account.getAccountHolderInformation();
				}
				catch(Exception e) {
					System.out.println("A/c not found");
				}
			}
			else if(choice==6) {
				System.out.println("Enter account Number");
				String accountNumber=sc.nextLine();
				
				Bank.removeAccount(accountNumber);
			}
			else if(choice==7){
				System.out.println("Exsit");
				break;
			}
			else {
				
			}
			
			
		}
	}

}

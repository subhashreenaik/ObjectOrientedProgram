package com.bridgelabz.account;

import java.util.Scanner;

public class Account {
    private double balance;
    
	public Account(double balance) {
	this.balance = balance;
	}
    public void debited(double balance) {
     System.out.println("enter the amount to withdraw");
     Scanner sc = new Scanner(System.in);
     double withdraw = sc.nextInt();
     if(withdraw>balance) {
    	 System.out.println("withdraw amount is greater than balance");
     }
     else {
    	 balance=balance -withdraw;
    	 System.out.println("balance is  "+balance);
     }
     
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the balance saved in account");
		Account accnt = new Account(sc.nextDouble());
		accnt.debited(accnt.balance);
	}

}

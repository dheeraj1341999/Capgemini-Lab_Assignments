package com.cg.lab4.model;

public class Account {
	
	public static long counter = 100;
	public Account() {
		this.accNum=Account.counter;
		Account.counter++;
	}
	public Account(double balance, Person person) {
		super();
		this.balance = balance;
		this.person = person;
	}

	private long accNum;
	private double balance;
	private Person person;

	public long getAccNum() {
		return accNum;
	}

//	public void setAccNum() {
//		this.accNum = Account.counter;
//		Account.counter++;
//	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public void deposit(double amount) {
		this.balance += amount;
		System.out.println("Amount is Deposited Sucessfully! Updated balance is " + this.balance);
	}

	public void withdraw(double amount) {
		if ((this.balance - amount) >= 500) {
			this.balance = this.balance - amount;
			System.out.println("Amount Withdrawn Sucessfully!. Updated Balance is " + this.balance);
		} else {
			System.out.println("Insufficient Funds Please check Balance");
		}
	}

}

package com.cg.lab4.ui;

import com.cg.lab4.model.Account;
import com.cg.lab4.model.Person;

public class Exercise1 {
	
	public static void main(String[] args) {
		
		Account smithAccount = new Account();

		smithAccount.setBalance(2000);
		Person smithPerson = new Person("smith",20);
		smithAccount.setPerson(smithPerson);
		System.out.println(smithAccount.getAccNum());
		System.out.println(smithAccount.getPerson().getName());
		System.out.println(smithAccount.getPerson().getAge());
		System.out.println(smithAccount.getBalance());
		Account kathyAccount = new Account();

		kathyAccount.setBalance(3000);
		Person kathyPerson = new Person("kathy",30);
		kathyAccount.setPerson(kathyPerson);
		System.out.println(kathyAccount.getAccNum());
		System.out.println(kathyAccount.getPerson().getName());
		System.out.println(kathyAccount.getPerson().getAge());
		System.out.println(kathyAccount.getBalance());
		smithAccount.deposit(2000);
		kathyAccount.withdraw(2000);
		System.out.println(smithAccount.getBalance());
		System.out.println(kathyAccount.getBalance());
	}


}

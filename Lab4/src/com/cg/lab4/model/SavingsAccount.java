package com.cg.lab4.model;

class SavingsAccount extends Account {
	public final double minimumBalance = 500.0;

	@Override
	public void withdraw(double amount) {
		
		if ((super.getBalance() - amount) > minimumBalance) {
			super.setBalance(super.getBalance() - amount);
			System.out.println("Amount Withdrawn Successfully!. Updated Balance is " + super.getBalance());
		} else {
			System.out.println("Insufficient balance");
		}
	}

}
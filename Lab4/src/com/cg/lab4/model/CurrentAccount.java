package com.cg.lab4.model;

class CurrentAccount extends Account {
	public final double overDraftLimit = 500.0;

	@Override
	public void withdraw(double amount) {
	
		if ((amount < overDraftLimit)) {
			super.setBalance(super.getBalance() - amount);
			System.out.println("Amount Withdrawn Successfully!. Updated Balance is " + super.getBalance());
		} else {
			System.out.println("Insufficient balance");
		}
	}
}

package com.constructor;

public class BankAccountClass {
	int Accountnumber;
	String AccountHolder;
	double Balance;
	BankAccountClass(int Accountnumber,String AccountHolder,double Balance){
		this.Accountnumber=Accountnumber;
		this.AccountHolder=AccountHolder;
		this.Balance=Balance;
	}
	public void setBalance(double Balance) {
		this.Balance=Balance;
	}
	public int getAccountnumber() {
		return Accountnumber;
	}
	public String getAccountHolder() {
		return AccountHolder;
	}
	public double getBalance() {
		return Balance;
	}
	public void Deposit(double Amount) {
		Balance=Balance+Amount;
		System.out.println("Deposited Amount:"+Amount);
	}
	public void withdraw(double Amount) {
		if(Balance>=Amount) {
			Balance=Balance-Amount;
			System.out.println("Withdrawn Amount:"+Amount);
		}else {
			System.out.println("Insufficient Balance");
		}
		
	}

}

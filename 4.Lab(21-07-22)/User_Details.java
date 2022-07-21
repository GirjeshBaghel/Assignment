package Revision;

import java.util.Scanner;

public class User_Details {
	
	//private variables
	private String bank,name;
	private long account,ph;	
	private  int pin;
	
	//global variables 
	static Scanner sc = new Scanner(System.in);
	char cont = 'y';
	static int choice,pin1,with,depo,bal=500;

	// getter and setter methods
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAccount() {
		return account;
	}
	public void setAccount(long account) {
		this.account = account;
	}
	public long getPh() {
		return ph;
	}
	public void setPh(long ph) {
		this.ph = ph;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
}

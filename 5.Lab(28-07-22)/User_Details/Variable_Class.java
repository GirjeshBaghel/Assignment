//Write a program to accept basic details name , Phone No , Address , user Id and password from the user .throw an exception if 
//the user Id lenght is greater than 8 and password is not matched and should only contain the string value.
package Revision;

import java.util.Scanner;

public class Variable_Class {
  
	Scanner sc = new Scanner(System.in);
	// public variable that access by the another class
  String name,add,ph;
	// private variables
  private String password,id;
	
  // getter or setter method of Id or Password
  public String getId() {
		return id;
	}
	public String setId(String id) {
		return this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static final int PASSWORD_LENGTH = 8;
	
	public static void main(String[] args)
	{
		Variable_Class ob = new Variable_Class();
	}
	 
}

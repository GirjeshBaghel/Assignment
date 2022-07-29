package Revision;

import java.util.Scanner;

public class Age_Class {
	
	// main method 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Taking  age input from user
		System.out.print("Enter the Age : ");
		int age = sc.nextInt();
		// try catch block used to check a exception 
		try {
			// if age is smaller than 18 generate a exception
			if(age < 18 )
			{
				throw new Age_Exception("Not Valid Age.");
			}
			
			else
			{
				System.out.println("You are valid "+age);
			}
		}
		catch(Exception e) // catch exception that comes by the try block
		{
			System.out.println(e);
		}
		
			
	}

}

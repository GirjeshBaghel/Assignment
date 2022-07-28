package Revision;

import java.util.Scanner;

public class Age_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Age : ");
		int age = sc.nextInt();
		try {
			if(age < 18 )
			{
				throw new Age_Exception("Not Valid Age.");
			}
			else
			{
				System.out.println("You are valid "+age);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
			
	}

}

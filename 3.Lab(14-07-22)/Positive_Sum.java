//Write a program to accpet the positive numbers  from user and display the sum of that numbers using loop
package Revision;

import java.util.Scanner;

public class Positive_Sum {
	
	public void sum()
	{
		int no,res,sum;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a no : ");
		no = sc.nextInt();
		if(no%2 == 0)
		{
			for(sum=0; no!=0; no=no/10)
			{
				sum += no%10;
				
			}
			System.out.println("Sum of digits: "+sum);  
			
		}
		else
		{
			System.out.println("Please enter a positive no....");
		}
	}
	
	
	public static void main(String[] args)
	{
		Positive_Sum ob = new Positive_Sum();
		ob.sum();
	}
}

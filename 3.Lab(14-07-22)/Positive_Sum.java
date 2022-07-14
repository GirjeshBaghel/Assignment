//Write a program to accept the positive numbers  from user and display the sum of that numbers using loop
package Revision;

import java.util.Scanner;

public class Positive_Sum {
	
	// sum method calling by inside main method
	public void sum()
	{
		int no,res,sum=0;
		Scanner sc = new Scanner(System.in);
		//Taking a no from user
		System.out.print("Enter a no : ");
		no = sc.nextInt();
		// checking no is positive or not
		if(no%2 == 0)
		{
			// logic of sum of that no
			while(no>0)
			{
				res = no%10;
				sum = sum+res;
				no = no/10;
				
			}
			// printing the sum of that no
			System.out.println("Sum of digits: "+sum);  
			
		}
		// no is not positive then else run
		else
		{
			System.out.println("Please enter a positive no....");
		}
	}
	
	// main method
	public static void main(String[] args)
	{
		Positive_Sum ob = new Positive_Sum();
		ob.sum();
	}
}

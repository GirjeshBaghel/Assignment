package Revision;

import java.util.Scanner;

// Parent class 
public class Palidorm_Parent {
	public void pali()
	{
		// global variable declaration
		int n,r,temp,sum=0;
		Scanner sc = new Scanner(System.in);
		// Taking a no from user
		System.out.print("Enter a no : ");
		n = sc.nextInt();
		
		// original no is save in temp variable 
		temp = n;
		// checking no is greater than zero
		while(n>0)			
		{
			// logic to check no a palidrom or not
			r = n%10;
			sum = (sum*10)+r;
			n = n/10;
		}
		// check temp is equal to sum or not
		if(temp == sum)
		{
			System.out.println("This is Palidorm no : ");
		}
		else
			System.out.print("This is not a palidorm no : ");
		
	}

}

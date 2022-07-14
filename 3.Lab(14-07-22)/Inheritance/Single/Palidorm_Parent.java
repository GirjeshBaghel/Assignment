package Revision;

import java.util.Scanner;

public class Palidorm_Parent {
	public void pali()
	{
		int n,r,temp,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a no : ");
		n = sc.nextInt();
		temp = n;
		while(n>0)
		{
			r = n%10;
			sum = (sum*10)+r;
			n = n/10;
		}
		if(temp == sum)
		{
			System.out.println("This is Palidorm no : ");
		}
		else
			System.out.print("This is not a palidorm no : ");
		
	}

}

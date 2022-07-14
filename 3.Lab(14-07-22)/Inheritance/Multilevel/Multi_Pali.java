//WAP to create a class for Fibonacci series, second class Palindrom No , Third class use both the class property and display the output
package Revision;

// Palidorm class taking all properties of Fibo class
public class Multi_Pali extends Multi_Fibo
{
	
	// pali method that call by another class
	public void pali()
	{			
		System.out.print("Enter a no : ");
		n = sc.nextInt();
		temp = n;
		// check no is greater then zero
		while(n>0)
		{
			//logic of pali no
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

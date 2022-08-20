//Write a program to accept a string from the user and accept a character from the user and remove all occurrences of a given character from input String.
package String;
import java.util.Scanner;

public class Remove_Occurence {

	Scanner sc = new Scanner(System.in);				// global variable declaration
	String str;
	char c;
	int i,j,count;
	
	Remove_Occurence()						// constructor 
	{
		System.out.print("Enter a String here : ");		// taking a string from user
		str = sc.nextLine();
		System.out.print("Enter a Character : ");		// taking a character to remove from the string
		c = sc.next().charAt(0);				// storing a character
		str = str.toLowerCase();				// convert a string in a lower case
		char[] t = str.toCharArray();				// stored that string in t array
		for(i=j=0; i<str.length(); i++)				// for loop running the for two times I and J
		{
			if(t[i] != c)
			{
				t[j++] = t[i];
			}
			else 
				count++;
		}
		while(count>0)						// checking count is greater than zero than while running
		{
			t[j++] = '\0';
	        	count--;
		}
		System.out.println(t);
		
	}
	
	
	public static void main(String... args)				// main method
	{
		new Remove_Occurence();					// consructor calling
	}	
}

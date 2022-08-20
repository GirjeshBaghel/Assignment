//Write a program to reverse each word of the string without using a reverse method.
package String;
import java.util.Scanner;

public class String_Reverse {			
	
	Scanner sc = new Scanner(System.in);				// global variables are here
	String str,st="";
	char ch;
	void accept()							// accept method that accept the string from user
	{
		System.out.print("Enter a String : ");
		 str = sc.nextLine();
	}
	void reverse()							// reverse method that reverse a string here
	{
		accept();						// calls a accept methods
		for(int i=0; i<str.length(); i++)			// loop running for string length
		{
			ch = str.charAt(i);				// convert a string index whole value in char
			st = ch+st;					// concat a char with string
		}
		System.out.print(st);	
	}

	public static void main(String[] args) {			// main method
		
		String_Reverse ob= new String_Reverse();		// creating a object
		ob.reverse();						// calls a reverse method
	}

}

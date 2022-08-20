//Write a program to prove that string is immutable .
package String;
import java.util.Scanner;

public class String_Immutable {
	Scanner sc = new Scanner(System.in);						// global variable are stored here
	String str,str1,ch;
	
	String_Immutable()								// constructor 
	{
		System.out.print("Enter First String here : ");				// taking  first string from user
		str = sc.nextLine();
		System.out.print("Enter Second String here : ");			// taking  second string from user
		str1 = sc.nextLine();
		System.out.println("Before Changing : "+str+" "+str1);
		check(str,str1);							// calls the check method and passing the arguments
		System.out.print("Enter a String to Change : ");			// taking a string to change the first string
		ch = sc.nextLine();
		 str = str.concat(ch);							// concat first string with taking string
		System.out.println("After Change : "+str+" "+str1);
		check(str,str1);							// calls the check method with two arguments
		
			
	}
	void check(String x, String y)							// check method
	{
		
		if(x == y)								// checking the reference variable here
		{
			
			System.out.println("This is Mutable");
		}
		else
		{
			
			System.out.println("This is Immutable");			// else part
		}
	}	
	
	public static void main(String[] args)						// main method
	{
		
		new String_Immutable();							// calling a constructor
		
	}

}

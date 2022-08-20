//Write a program to accept string from the user and check it is palindrome or not without using function of string builder and string buffer.
package String;
import java.util.Scanner;

public class String_Palindrom {
	Scanner sc = new Scanner(System.in);					// global declaration
	String st,rev="";
	char ch;
	
	public void accept()							// accept the string from user
	{
		System.out.print("Enter a String : ");
		st = sc.nextLine();
		st = st.toLowerCase();
		for(int i=0; i<st.length(); i++)				// loop running for the string length
		{
			ch = st.charAt(i);					// storing a string into a char
			rev = ch+rev;									
		}
		
		if(st.equals(rev))						// checking a reverse string is equal to a normal string
		{
			System.out.println("It is Palindrome String : "+rev);
		}
		else
			System.out.println("Not a Palindrome String : "+st);
				
	}
	
	public static void main(String[] args) {				// main method
		
		String_Palindrom ob = new String_Palindrom();			// creating a object 
		ob.accept();							// calls a accept method
	}

}

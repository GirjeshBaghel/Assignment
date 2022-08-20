//Write a program to accept string from user and find all permutations of the string.
package String;
import java.util.Scanner;

public class String_Permutation 
{
	static Scanner sc = new Scanner(System.in);			
		public static void demo(String s1,String s2)    	// demo method that contains recursion process
		{
			if(s1.length() == 0)				// if string length is zero than print that statement
    			{
        			System.out.println(s2);
    			}
    			for(int i=0 ; i<s1.length() ; i++)		// for running for the string length
    			{
				char ch = s1.charAt(i);			// string convert in a char
				String ls = s1.substring(0,i);		
				String rs = s1.substring(i+1);
				String rest = ls + rs;			// concat a string into a another string
				demo(rest , s2+ch);			// calling a same method
			  }
		}	

		public static void main(String[] args) 			// main method
		{

			System.out.print("Enter a String : ");		// taking a string from user
			String st = sc.nextLine();
			String st2= "";
			demo(st,st2);					// calling a demo method

		}
}

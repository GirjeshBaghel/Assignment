/*Write a program to check if two strings are created with same character
Write a program to accept two strings from the use and check if first contains second
Write a program to swap two strings without using third variable
*/
package String;
import java.util.Scanner;

public class Conditions_Class {
	
	Scanner sc = new Scanner(System.in);						// global variable declaration
	String str1, str2,str3;
	String[] word1,word2;
	StringBuffer st;
	char[] ch1,ch2;
	int i,j,count;
	boolean temp = true;
	void accept()									// accept method
	{
		System.out.print("Enter a First String : ");				// taking a first string from user
		str1 = sc.nextLine();
		System.out.print("Enter a Second String : ");				// taking a second string from user
		str2 = sc.nextLine();
		
	}
	void same_char()								// same character method
	{
		accept();								// accept method calls
		ch1 = str1.replaceAll("\\s+"," ").toLowerCase().toCharArray();		// storing a string into a char
		ch2 = str2.replaceAll("\\s+"," ").toLowerCase().toCharArray();
		for(i=0; i<str1.length(); i++)						
		{
			for(j=0; j<str2.length(); j++)
			{
				if(ch1[i] == ch2[j] )					// checking string first is equal to string second
				{
					System.out.print(ch2[j]+"");			// printing the same string
				}
			}
		}		
	}
	
	void same_words()								// same words method
	{
		accept();								// accept method
		word1 = str1.toLowerCase().split("\\s");				// spliting the string
		word2 = str2.toLowerCase().split("\\s");
		System.out.print("Same Words are : ");
		for(i=0; i<str1.length(); i++)						// for loop for running process				
		{ count=1;
			for(j=i+1; j<str2.length(); j++)
			{
				if(word1[i].equals(word2[j]))				// checking both string are equal
				{
					 count++;
					 st.append(word2[j]);				// adding string
				}
			}
			
		}
		System.out.println(st);							// printing same words here
		System.out.println("No of Words Count : "+count);			// printing no of count words
		
	}
	void swap_words()								// swap words method
	{
		accept();								// accept method calling
		System.out.print("Before Swap : "+str1);
		System.out.println("\nBefore Swap : "+str2);
		str1 = str1+str2;
		str2 = str1.substring(0, str1.length() - str2.length());		// sub string method to containing 0 to length
		str1 = str1.substring(str2.length());					// swapping the words
		System.out.println("After Swap : "+str1);
		System.out.println("After Swap : "+str2);
		
	}
	public static void main(String[] args)						// main methods	
	{
		Conditions_Class ob = new Conditions_Class();				// creating a object
		ob.same_char();								// calling a methods
		ob.same_words();
		ob.swap_words();
	}

}

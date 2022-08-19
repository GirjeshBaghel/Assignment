/*Write a program to check if two strings are created with same character
Write a program to accept two strings from the use and check if first contains second
Write a program to swap two strings without using third variable
*/
package String;
import java.util.Scanner;

public class Conditions_Class {
	
	Scanner sc = new Scanner(System.in);
	String str1, str2,str3;
	String[] word1,word2;
	StringBuffer st;
	char[] ch1,ch2;
	int i,j,count;
	boolean temp = true;
	void accept()
	{
		System.out.print("Enter a First String : ");
		str1 = sc.nextLine();
		System.out.print("Enter a Second String : ");
		str2 = sc.nextLine();
		
	}
	void same_char()
	{
		accept();
		ch1 = str1.replaceAll("\\s+"," ").toLowerCase().toCharArray();
		ch2 = str2.replaceAll("\\s+"," ").toLowerCase().toCharArray();
		for(i=0; i<str1.length(); i++)
		{
			for(j=0; j<str2.length(); j++)
			{
				if(ch1[i] == ch2[j] )
				{
					System.out.print(ch2[j]+"");
				}
			}
		}		
	}
	
	void same_words()
	{
		accept();
		word1 = str1.toLowerCase().split("\\s");
		word2 = str2.toLowerCase().split("\\s");
		System.out.print("Same Words are : ");
		for(i=0; i<str1.length(); i++)
		{ count=1;
			for(j=i+1; j<str2.length(); j++)
			{
				if(word1[i].equals(word2[j]))
				{
					 count++;
					 st.append(word2[j]);
				}
			}
			
		}
		System.out.println(st);
		
	}
	void swap_words()
	{
		accept();
		System.out.print("Before Swap : "+str1);
		System.out.println("\nBefore Swap : "+str2);
		str1 = str1+str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("After Swap : "+str1);
		System.out.println("After Swap : "+str2);
		
	}
	public static void main(String[] args)
	{
		Conditions_Class ob = new Conditions_Class();
		ob.same_char();
		ob.same_words();
		ob.swap_words();
	}

}

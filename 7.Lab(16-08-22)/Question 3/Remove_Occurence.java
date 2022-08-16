//Write a program to accept a string from the user and accept a character from the user and remove all occurrences of a given character from input String.
package String;
import java.util.Scanner;

public class Remove_Occurence {

	Scanner sc = new Scanner(System.in);
	String str;
	char c;
	int i,j,count;
	
	Remove_Occurence()
	{
		System.out.print("Enter a String here : ");
		str = sc.nextLine();
		System.out.print("Enter a Character : ");
		c = sc.next().charAt(0);
		str = str.toLowerCase();
		char[] t = str.toCharArray();
		for(i=j=0; i<str.length(); i++)
		{
			if(t[i] != c)
			{
				t[j++] = t[i];
			}
			else 
				count++;
		}
		while(count>0)
		{
			t[j++] = '\0';
	        count--;
		}
		System.out.println(t);
		
	}
	
	
	public static void main(String... args)
	{
		new Remove_Occurence();
	}
}

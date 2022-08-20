//Write a program to reverse each word of the string.
package String;
import java.util.Scanner;

public class String_Reverse {			
	
	static Scanner sc = new Scanner(System.in);			// global variable declaration
	static StringBuffer str1 = new StringBuffer("");		// creating string buffer here 
	static StringBuffer str2 = new StringBuffer("");
	
	 static void accept()						// accept method
	{
		System.out.print("Enter a First String : ");		// taking a string from user
		str1.append(sc.nextLine());
		System.out.print("Enter a Second  String : ");		// taking a another string from user
		str2.append(sc.nextLine());
				
	}
	void reverse()							// reverse method
	{
		accept();						// calling a reverse method
		System.out.println("Reverse String are : "+str1.reverse());	
	}

	public static void main(String[] args) {			// main method
		
		String_Reverse ob= new String_Reverse();		// creating a object
		ob.reverse();						// calls a reverse method
	}

}

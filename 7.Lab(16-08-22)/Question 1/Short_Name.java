//Write a program to accept full name form the user and display the abbreviations of the first and middle names except the last name which is displayed as it is. 
//EG: Name:Manoj Rakesh Gupta  . (M.R.Gupta)
package String;
import java.util.Scanner;

public class Short_Name {
	
	Short_Name()                                              // constructor
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name   ex : (Girjesh Singh Baghel)");  // example how user pass our name
		System.out.print("FirstName : ");										     // taking first name
		String fn = sc.nextLine();												   
		System.out.print("MiddleName : ");										   // taking middle name
		String mn = sc.nextLine();
		System.out.print("LastName : ");										     // taking last name 
		String ln = sc.nextLine();
		System.out.println("Your Short Name : "+"("+fn.charAt(0)+"."+mn.charAt(0)+")"+ln);		// from the chatAt function printing the string first letter
	}
	
	public static void main(String[] args)											// main function
	{
		new Short_Name();															// calling a constructor
	}

}

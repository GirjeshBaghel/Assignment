//Write a program to reverse each word of the string.
package String;
import java.util.Scanner;

public class String_Reverse {
	
	 static Scanner sc = new Scanner(System.in);
	static StringBuffer str1 = new StringBuffer("");
	static StringBuffer str2 = new StringBuffer("");
	
	 static void accept()
	{
		System.out.print("Enter a First String : ");
		str1.append(sc.nextLine());
		System.out.print("Enter a Second  String : ");
		str2.append(sc.nextLine());
				
	}
	void reverse()
	{
		accept();
		System.out.println("Reverse String are : "+str1.reverse());
	}

	public static void main(String[] args) {
		
		String_Reverse ob= new String_Reverse();
		ob.reverse();
	}

}
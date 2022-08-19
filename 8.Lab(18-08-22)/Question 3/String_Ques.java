
package String;

import java.util.Scanner;

public class String_Ques {
	
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
		
		String_Ques ob= new String_Ques();
		//ob.reverse();
	}

}

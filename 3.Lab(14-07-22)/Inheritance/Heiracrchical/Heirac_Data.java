// WAP where one class taking data and second class Sum ,class Mul,class Div,class Sub, class Mod. These classes taking input from data class
package Revision;

import java.util.Scanner;

// Main class that carry data
public class Heirac_Data {

	Scanner sc = new Scanner(System.in);
	
	// global variable that is used in all the classes
	int a,b,cal;
	
	// accept method that calling by another classes
	public void accept()
	{
		// Taking two values from user
		System.out.print("Enter the two no here :  ");
		a = sc.nextInt();
		b = sc.nextInt();
		
	}
}

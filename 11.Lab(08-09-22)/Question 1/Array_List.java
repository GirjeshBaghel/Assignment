/*write a program to accept name, Email, Phone Number, Percentage from the user and store the data using arraylist.
Accept name from the user and remove all the data from the list and display the output. and also perform the searching 
operation with the help of the name.*/
package Revision;
import java.util.*;
import java.util.Scanner;

public class Array_List {
	
	Scanner sc = new Scanner(System.in);
	int no,i;
	String name,email,ph,per,name1;
	void accept()
	{
		System.out.println("How many Students data to be stored : ");
		no = sc.nextInt();
		
		ArrayList<String> an = new ArrayList<>(no);
		ArrayList<String> ae = new ArrayList<>(no);
		ArrayList<String> apn = new ArrayList<>(no);
		ArrayList<String> ap = new ArrayList<>(no);
		for(i=0; i<no; i++)
		{
			System.out.println("Enter the Student Details here  : ");
			System.out.print("Name : ");
			name = sc.next();
			an.add(name);
			System.out.print("Email : ");
			email = sc.next();
			ae.add(email);
			System.out.print("Phone No : ");
			ph= sc.next();
			apn.add(ph);
			System.out.print("Percentage : ");
			per= sc.next();
			ap.add(per);		
							
		}
		
		System.out.println("Name : "+an);
		System.out.println("Email : "+ae);
		System.out.println("Phone No : "+apn);
		System.out.println("Percentage : "+ap);
		System.out.println("Enter the Name to delete : ");
		name1 = sc.next();
		an.contains(name1);
		if(name1.equalsIgnoreCase(name))
		{
			an.remove(name);
			System.out.println("Name : "+an);
			
		}
		
	}
	public static void main(String[] args)
	{
		Array_List ob = new Array_List();
		ob.accept();
	}

}

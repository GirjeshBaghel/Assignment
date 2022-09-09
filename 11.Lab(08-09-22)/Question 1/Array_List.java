/*write a program to accept name, Email, Phone Number, Percentage from the user and store the data using arraylist.
Accept name from the user and remove all the data from the list and display the output. and also perform the searching 
operation with the help of the name.*/
package Revision;
import java.util.*;
import java.util.Scanner;

public class Array_List {
	
	Scanner sc = new Scanner(System.in);						// global variable 
	int no,i;
	String name,email,ph,per,name1,dn,de,dpn,dper;
	void accept()									// accept method that the data fron the user
	{
		System.out.println("How many Students data to be stored : ");
		no = sc.nextInt();
		
		ArrayList<String> an = new ArrayList<>(no);				// making arraylist of name 
		ArrayList<String> ae = new ArrayList<>(no);				// making arraylist of email 
		ArrayList<String> apn = new ArrayList<>(no);				// making arraylist of phone no 
		ArrayList<String> ap = new ArrayList<>(no);				// making arraylist of percentage 
		
		for(i=0; i<no; i++)							// for loop for no of student data to be stored
		{
			System.out.println("Enter the Student Details here  : ");	
			System.out.print("Name : ");					// taking a student name
			name = sc.next();						
			an.add(name);
			System.out.print("Email : ");					// taking a student email
			email = sc.next();
			ae.add(email);
			System.out.print("Phone No : ");				// taking a student Phone No
			ph= sc.next();
			apn.add(ph);
			System.out.print("Percentage : ");				// taking a student percentage
			per= sc.next();
			ap.add(per);		
			
		}
		
		System.out.println("Name : "+an);					// printing the name Array List 
		System.out.println("Email : "+ae);					// printing the email Array List 
		System.out.println("Phone No : "+apn);					// printing the Phone No Array List 
		System.out.println("Percentage : "+ap);					// printing the Percentage Array List 
		System.out.println("Enter the Name to delete : ");
		name1 = sc.next();							// taking a name to be delete the data of that array list
		for(i=0; i<an.size(); i++)
		{
			if(an.get(i).contains(name1))
			{
				dn  = an.get(i).replaceAll(name, "");
				 de  = ae.get(i).replaceAll(email, "");
				 dpn = apn.get(i).replaceAll(ph, "");
				dper = ap.get(i).replaceAll(per, "");
								
				System.out.println("Successfully Deleted ");
				System.out.println("Name : "+an.get(i));
				System.out.println("Email : "+ae.get(i));
				System.out.println("Phone No : "+apn.get(i));
				System.out.println("Percentage : "+ap.get(i));
				
			}
			else
			{
				System.out.println("Name not Found ..");
			}
		}
		
	}
	public static void main(String[] args)						// main method
	{
		Array_List ob = new Array_List();
		ob.accept();								// calling accept method
	}

}

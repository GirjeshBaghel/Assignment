package JDBC_Program;

import java.util.Scanner;

public class Start1  {							// start class that start the program
	int c;
	char ans;
	String name,phone,city;
	Scanner sc = new Scanner(System.in);				// global variables
	
	
	public static void main(String[] args)  throws Exception{	// main method that call the start method
		Start1 ob = new Start1();
		ob.start();
		
	}
	public void addstd() throws Exception				// add student method that add the data of student
	{
		System.out.print("Enter Student Name : ");
		name  = sc.next();					// taking the name 
		
		System.out.print("Enter Student Phone No  : ");
		phone = sc.next();					// taking the Phone no
		 
		 System.out.print("Enter Student City : ");		
		 city = sc.next();					// taking the city name
		 
		 Student st = new Student(name,phone,city);		// passing to the Student Constructor
		boolean ans = StudentDao.insertStudentToDB(st);		// pass to the Student insert method
		if(ans)
		{
			System.out.println("Successfully Added ..");
		}
		else
			System.out.println("Something Went Wrong try again.");
		
		 System.out.println(st);		
	}
	public void delstd() throws Exception					// delete student data method
	{
		System.out.print("Enter Student Id to Delete Data : ");
		int d_id = sc.nextInt();					// taking the student id
		boolean ans =StudentDao.deleteStudentToDB(d_id);		// pass that id to the student class 
		if(ans)
		{
			System.out.println("Successfully Added ..");
		}
		else
			System.out.println("Something Went Wrong try again.");	
	}
	
	public void start() throws Exception					// start method that the program
	{
		System.out.println("Welcome to Student Manager App");
		do
		{
			System.out.println("PRESS 1 : ADD Student Data");		// printing these lines of code
			System.out.println("PRESS 2 : DELETE Student Data");
			System.out.println("PRESS 3 : DISPLAY Student Data");
			System.out.println("PRESS 4 : Update Student Data");
			System.out.print("\nPlease Enter your Choice :" );
			
			 c = sc.nextInt();
			switch(c)							// switch case to switch the conditions
			{
				case 1:
					addstd();					// call add methods
					break;
				
				case 2:	
					delstd();					// call to delete method
					break;
					
				case 3:
					StudentDao.showAllStudent();			// calls show method that are make in Student Class
					break;
				case 4:
					StudentDao.updateStudent();			// update method call that are make in Student Class
					break;
				default:
					break;
				
			}
			System.out.println("Do you want to Continue  :  Y/N");
			ans = sc.next().charAt(0); 
		}
		while(ans == 'y' || ans =='Y');
		System.out.println("Thanks You for using this Application");

	}

	
}



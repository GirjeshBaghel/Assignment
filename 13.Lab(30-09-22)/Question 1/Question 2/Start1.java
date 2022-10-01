package JDBC_Program;

import java.util.Scanner;

public class Start1  {
	int c;
	char ans;
	String name,phone,city;
	Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args)  throws Exception{
		Start1 ob = new Start1();
		ob.start();
		
	}
	public void addstd() throws Exception
	{
		System.out.print("Enter Student Name : ");
		name  = sc.next();
		
		System.out.print("Enter Student Phone No  : ");
		phone = sc.next();
		 
		 System.out.print("Enter Student City : ");
		 city = sc.next();
		 
		 Student st = new Student(name,phone,city);
		boolean ans = StudentDao.insertStudentToDB(st);
		if(ans)
		{
			System.out.println("Successfully Added ..");
		}
		else
			System.out.println("Something Went Wrong try again.");
		
		 System.out.println(st);		
	}
	public void delstd() throws Exception
	{
		System.out.print("Enter Student Id to Delete Data : ");
		int d_id = sc.nextInt();
		boolean ans =StudentDao.deleteStudentToDB(d_id);
		if(ans)
		{
			System.out.println("Successfully Added ..");
		}
		else
			System.out.println("Something Went Wrong try again.");	
	}
	
	public void start() throws Exception
	{
		System.out.println("Welcome to Student Manager App");
		do
		{
			System.out.println("PRESS 1 : ADD Student Data");
			System.out.println("PRESS 2 : DELETE Student Data");
			System.out.println("PRESS 3 : DISPLAY Student Data");
			System.out.println("PRESS 4 : Update Student Data");
			System.out.print("\nPlease Enter your Choice :" );
			
			 c = sc.nextInt();
			switch(c)
			{
				case 1:
					addstd();
					break;
				
				case 2:
					delstd();
					break;
					
				case 3:
					StudentDao.showAllStudent();
					break;
				case 4:
					StudentDao.updateStudent();
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



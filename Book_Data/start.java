package Books;

import java.util.Scanner;

import JDBC_Program.Student;
import JDBC_Program.StudentDao;

public class Start {
	 Scanner sc = new Scanner(System.in);
	 int c;
	 char ans;
	 float b_price;
	 String b_id,b_title,b_author,b_category;
	 
	 public void addbook() throws Exception
		{
			System.out.print("Enter Book Id : ");
			b_id  = sc.next();
			
			System.out.print("Enter Book Title  : ");
			b_title = sc.next();
			 
			 System.out.print("Enter Book Author Name : ");
			 b_author = sc.next();
			 
			 System.out.print("Enter Book Category : ");
			 b_category = sc.next();
			 
			 System.out.print("Enter Book Price : ");
			 b_price = sc.nextFloat();
			 
			Book_Data st1 = new Book_Data(b_id,b_title,b_author,b_category,b_price);
			boolean ans = BookDao.addbookDao(st1);
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
			System.out.println("PRESS 1 : ADD Book");
			System.out.println("PRESS 2 : Search Book By Title");
			System.out.println("PRESS 3 : Search Book By Author Name");
			System.out.println("PRESS 4 : Display All Book");
			System.out.print("\nPlease Enter your Choice :" );
			
			 c = sc.nextInt();
			switch(c)
			{
				case 1:
					addbook();
					break;
				
				case 2:
					BookDao.dis_titleDao();
					break;
					
				case 3:
					//search_author();
					break;
				case 4:
					BookDao.dis_allDao();
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

	public static void main(String[] args)  throws Exception{
		Start ob = new Start();
		ob.start();

	}

}

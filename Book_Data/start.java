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
			if(b_id.charAt(0)!='b' && b_id.charAt(0)!='B')
			{
				throw new Exception("enter valid book id.......(BOOK ID SHOULD START WITH B OR b)");
			}
			
			System.out.print("Enter Book Title  : ");
			b_title = sc.next();
			 
			 System.out.print("Enter Book Author Name : ");
			 b_author = sc.next();
			 
			 System.out.print("Enter Book Category : ");
			 b_category = sc.next();
			 if(b_category!= "Science" &&  b_category!="Fiction"&& b_category!="Technology"&& b_category!="other")
				{
					throw new Exception("enter valid category.......(CATEGERY SHOULD HAVE SCIENCE,FICTION,TECHNOLOGY,ETC)");
				}
			 
			 System.out.print("Enter Book Price : ");
			 b_price = sc.nextFloat();
			
			if(b_price < 0 ) {
					//this  get caught in catch block
					throw new Exception("enter valid price.......(PRICE SHOULD NOT BE NAGATIVE)");	
				}
			 
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
		System.out.println("Welcome to Books Data ");
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
					title_sear();
					
					break;
					
				case 3:
					author_sear();
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

	public  void title_sear() throws Exception {
			System.out.println("Enter Title Name here : ");
			String til = sc.next();
			boolean f = true;
			if(f)
			{
				BookDao.dis_titleDao(til);
			}
			else
				System.out.println("Please Enter correct Title here ");
		}
	public  void author_sear() throws Exception {
		System.out.println("Enter Author Name here : ");
		String au = sc.next();
		boolean f = true;
		if(f)
		{
			BookDao.dis_authorDao(au);
		}
		else
			System.out.println("Please Enter correct Title here ");

	}
	public static void main(String[] args)  throws Exception{
		Start ob = new Start();
		ob.start();

	}

}

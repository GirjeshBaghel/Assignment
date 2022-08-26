/*Write a program to accept name from the user accordingly create the file,
 *  the no of file creation will be depend upon the user.
 *  Accept the data from the user and store the data from the file which is selected by the user,
 *  and also perform the delete operation using file.
 */
package InputOutput;
import java.io.*;
import java.util.Scanner;

public class User_Choice {							// class level variable
	static String filename;				
	static String str,read,del,write;
	
	public static void main(String[] args) throws IOException 		//main method
	{
		display_details();						// calling static display detail method
	}
	
	public static void file_create() throws IOException			// create file here
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter file name to create:");			// taking the file from user
		filename=sc.nextLine();
		
		File obj= new File("D:\\FileUpload\\"+filename);		//file will be create in that location
		obj.createNewFile();
		System.out.println("Your file is created with ("+filename+") name..... ");
	}
		
	public static void file_write() throws IOException 			// Writing the data into the file 
	{			
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your file name to write the data : ");	// taking a file name from user to write the data
		write=sc.nextLine();
		File obj= new File("D:\\FileUpload\\"+write);
		if(obj.exists()) 
		{
			FileWriter fw1=new FileWriter(obj);			//create file writer for store the data
			System.out.print("Enter your data : ");			// taking a data to be write
			str=sc.nextLine();
			fw1.write(str); 
			fw1.close(); 
			System.out.println("Data succesfully written in ("+write+") file.....");
		}
		else 
			System.out.println("file is not found..........");
	}	
	
	public static void file_read() throws FileNotFoundException 		// create  read method with throws exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your file name to read the data : ");	
		read=sc.nextLine();						// taking file name to read the data
		File obj=new File("D:\\FileUpload\\"+read);
		if(obj.exists())
		{
			Scanner s=new Scanner(obj);			
			while(s.hasNextLine())					// reading the data from the file
			{
				String data=s.nextLine();
				System.out.println("Data in file ("+read+") file: " +data);	// printing the file data into a concole
			}
		}
		else 
		System.out.println("File is not found..........");
			
	}	
	
	public static void file_delete() throws FileNotFoundException    	// creating delete method to delete a file
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your file name to delete : ");		// taking a file name from user to be delete it
		del=sc.nextLine();
		File obj=new File("D:\\FileUpload\\"+del);

		if(obj.delete())						// checking file exists or not
			System.out.println("("+obj.getName()+") file successfully deleted.........");
		
		    else
			System.out.println("File is not found..........");
			
	}

	public static void display_details() throws IOException 		// display method that taking a many conditions
	{
		Scanner sc=new Scanner(System.in);
		char ans;
	        do 
		{
			 System.out.println("\n1.Create a file\n2.Write in the file \n3.Read the data in the file\n4.Delete a file\n");
			 System.out.print("Enter the which operation do you want :- ");
			 int  a = sc.nextInt();
		         switch(a) 						// switch case giving a option to user
			 {
			      case 1:						// case 1 that calls file create method
			      {
				  System.out.println("How many file you want to create:");
			      	  int n=sc.nextInt();
				  for(int i=1;i<=n;i++) 
				  {
					  file_create();
				  }
			      }
			      break;
					 
			      case 2:file_write();				// case 2 that calls a file_write method
			      break;
					 
			      case 3:file_read();				// case 3 that calls a file_read method
			      break;
					 
			      case 4:file_delete();				// case 4 that calls a file_delete method
			      break;
			      default:					 	// default invalid type
			    		System.out.println(" Please Enter Vaild Input");
			}
		       	System.out.println("\nDo you want to more operation for file:  Y/N");	// taking user choice to continue process
			ans = sc.next().charAt(0); 
		}
		while(ans == 'y'|| ans =='Y');					// do loop when ans of user is yes
	}	
}

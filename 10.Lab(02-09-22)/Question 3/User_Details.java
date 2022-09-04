//Write a program to accept N User details Name, No , Address, email ,UserID , Password .
//Store user ID and password in the file .Accept  a  userID from the user and delete that record from the file.
package Revision;
import java.io.*;
import java.util.Scanner;

public class User_Details 
{
	static String filename,filename1;						// globally declared the variable
	static String name,address,email_id,user_id,password,phone_no;
	static Scanner sc=new Scanner(System.in);
	private static Scanner x;
	 
	public static void main(String[] args) throws IOException 			// main method
	{
	   file_create();
   	   file_write();
	   details_delete();
	}
	
	public static void file_create() throws IOException 				// file create method that create a file
	{
		System.out.println("Enter your file name to create:");
		filename=sc.nextLine();							
		File obj= new File("D:\\FileUpload\\"+filename);			// creating a first file
		obj.createNewFile();
		
		filename1=sc.nextLine();			
		File obj1= new File("D:\\FileUpload\\"+filename1);			// creating a second file
		obj1.createNewFile();
		System.out.println("file is created with ("+filename+","+filename1+") name ");
	}
		
	public static void file_write() throws IOException				// file write method
	{
		Scanner sc1=new Scanner(System.in);
		File obj= new File("D:\\FileUpload\\"+filename);
		FileWriter fw1=new FileWriter(obj);	
		System.out.println("How many user detail store in file:");		// taking no of user data should be stored
	        int n=sc.nextInt(); 
		for(int i=1;i<=n;i++) 							// taking a user details here
	    	{	
			System.out.println("Enter your name:");
			name=sc1.nextLine();
			System.out.println("Enter your  Phone No :");
			phone_no=sc1.nextLine();
			System.out.println("Enter your  Address :");
			address=sc1.nextLine();
			System.out.println("Enter your Email Id :");
			email_id=sc1.nextLine();
			System.out.println("Enter your  UserID :");
			user_id=sc1.nextLine();
			System.out.println("Enter your Password :");
			password=sc1.nextLine();
			fw1.write("\n"+user_id +","+name+","+phone_no+","+email_id+","+	address); // write data into a file
	    	 }
		fw1.close();
		System.out.println("user details is writen in your file");
	}
		
	public static void details_delete() throws IOException 				// delete method that delete the user data
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter user id");
		String removeterm = sc.nextLine();
		String filepath= filename;
		remove(filepath,removeterm);
	}
	public static void remove(String filepath, String removeterm) 			// remove method that remove a file data	
	{
		String tempfile=filename1;
		File oldFile=new File(filepath);
		File newFile=new File(tempfile);
		String  user_id ="",name="",phone_no="",email_id="",address="";		// removing this data from user file
		try
		{
			FileWriter fw= new FileWriter(tempfile, true);
			BufferedWriter bw= new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);
			x=new Scanner(new File(filepath));
			x.useDelimiter("t,\n");
			while(x.hasNext())
			{
				user_id=x.next();
				name=x.next();
				phone_no=x.next();
				email_id=x.next();
		  		address=x.next();
				if(!user_id.equals(removeterm))
				{
					pw.println(user_id +","+name+","+phone_no+","+email_id+","+address);
				}
			}
			x.close();
			pw.flush();
			pw.close();
			oldFile.delete();
			File dump=new File(filepath);
			newFile.renameTo(dump);
		}
		catch(Exception e)							// catching the exception here
		{
			System.out.println("Exception Occured : "+e);
		}
		System.out.println("Your File Data Have Been Deleted Successfully : ");
	}
	
}

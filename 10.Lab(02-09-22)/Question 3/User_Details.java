//Write a program to accept N User details Name, No , Address, email ,UserID , Password .
//Store user ID and password in the file .Accept  a  userID from the user and delete that record from the file.
package Revision;
import java.io.*;
import java.util.Scanner;


import javax.swing.JOptionPane;

public class User_Details {
	static String filename,filename1;// globally declared the variable
	static String name,address,email_id,user_id,password,phone_no;
	static Scanner sc=new Scanner(System.in);
	 private static Scanner x;
	 
	 
	//main method
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    file_create();
   file_write();
	    	  details_delete();
	  
	}
	
	/*************************************/
	//creating file create  method with throws exception
		public static void file_create() throws IOException {
			System.out.println("Enter your file name to create:");
			filename=sc.nextLine();
			
			//create a file
		File obj= new File("D:\\FileUpload\\"+filename);
			obj.createNewFile();
			filename1=sc.nextLine();
			//create second file
		File obj1= new File("D:\\FileUpload\\"+filename1);
			obj1.createNewFile();
			System.out.println("file is created with ("+filename+","+filename1+") name ");
		}
		
		/******************************************/
		
		//creating file write method with throws exception
		public static void file_write() throws IOException {
			Scanner sc1=new Scanner(System.in);
			File obj= new File("D:\\FileUpload\\"+filename);
			FileWriter fw1=new FileWriter(obj);
			//create file writer for store the data
			// to store the data  in file
			System.out.println("How many user detail store in file:");
		      int n=sc.nextInt(); 
		      // user choice how many details they store in file 
	    	  for(int i=1;i<=n;i++) 
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
			//write a data in the file
	    		  fw1.write("\n"+
	    		  user_id +","+name
			+","+phone_no+","+email_id+","+
					address);
	    	  }
			fw1.close();
		System.out.println("user details is writen in your file");
		}
		
		
		/**
		 * @throws IOException *******************************/
		
		
		public static void details_delete() throws IOException {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter user id");
			// data use to delete form file
			String removeterm = sc.nextLine();
			
			String filepath= filename;
		remove(filepath,removeterm);
		}
		public static void remove(String filepath, String removeterm) {
			String tempfile=filename1;
			File oldFile=new File(filepath);
			File newFile=new File(tempfile);
			String  user_id ="",name="",phone_no="",email_id="",address="";
			try {
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
					if(!user_id.equals(removeterm)) {
						pw.println(user_id +","+name
								+","+phone_no+","+email_id+","+
								address);
					}
					}
					x.close();
					pw.flush();
					pw.close();
					oldFile.delete();
					File dump=new File(filepath);
					newFile.renameTo(dump);
					}
		catch(Exception e)
			{
			JOptionPane.showMessageDialog(null, "error");
			}
		 System.out.println("Your File Data Have Been Deleted Successfully : ");
		}
	
}

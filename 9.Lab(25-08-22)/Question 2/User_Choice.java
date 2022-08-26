
/*Q2) Write a program to accept name from the user accordingly create the file,
 *  the no of file creation will be depend upon the user.
 *  Accept the data from the user and store the data from the file which is selected by the user,
 *  and also perform the delete operation using file.
 */
package InputOutput;
import java.io.*;
import java.util.Scanner;

public class User_Choice {
	// globally declared 
	static String filename;
	static String str,read,del,write;
	/*****************************************/
	
	//main method
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	display_details();// calling static display detail method
	}
	
	/*****************************************/
	
	// create static file create method with throws exception
public static void file_create() throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter file name to create:");
		filename=sc.nextLine();
		//create a file
	File obj= new File("D:\\FileUpload\\"+filename);
		obj.createNewFile();
		System.out.println("Your file is created with ("+filename+") name..... ");
	}
	
	/*****************************************/
	
	// create static file write method with throws exception
	public static void file_write() throws IOException {
		 Scanner sc=new Scanner(System.in);
		System.out.print("Enter your file name to write the data : ");
		 write=sc.nextLine();
		File obj= new File("D:\\FileUpload\\"+write);
		if(obj.exists()) {
		FileWriter fw1=new FileWriter(obj);//create file writer for store the data
		// to store the data  in file
		System.out.print("Enter your data : ");
		str=sc.nextLine();
		fw1.write(str); 
		fw1.close(); 
		System.out.println("Data succesfully written in ("+write+") file.....");
	}else {
		System.out.println("file is not found..........");
	}}
	
	/*****************************************/
	
	// create static file read method with throws exception
	public static void file_read() throws FileNotFoundException {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your file name to read the data : ");
		 read=sc.nextLine();
		File obj=new File("D:\\FileUpload\\"+read);
		//condition for check the data is present in the file or not
if(obj.exists())
{
  Scanner s=new Scanner(obj);
	//display the data to read
	while(s.hasNextLine())
	{
		String data=s.nextLine();
		System.out.println("Data in file ("+read+") file: " +data);
	}
}
    else {	
	System.out.println("File is not found..........");
}		}
	
	/*****************************************/
	
	// create static file create method with throws exception
	public static void file_delete() throws FileNotFoundException {
		 Scanner sc=new Scanner(System.in);
		System.out.print("Enter your file name to delete : ");
		del=sc.nextLine();
		File obj=new File("D:\\FileUpload\\"+del);
		//condition for check the file is present  or not
if(obj.delete())
{
	System.out.println("("+obj.getName()+") file successfully deleted.........");
}
    else {
	System.out.println("File is not found..........");
}	
	}
	
	/*****************************************/
	
	// create static file create method with throws exception
	public static void display_details() throws IOException {
		 Scanner sc=new Scanner(System.in);
	   char ans;
    //condition for user when user want
	   do {
 System.out.println("\n1.Create a file\n2.Write in the file \n3.Read the data in the file\n4.Delete a file\n");
	    System.out.print("Enter the which operation do you want :- ");
		   int  a = sc.nextInt();
     // display different operation according to the user choice
		     switch(a) {
	      case 1:{
	    	  System.out.println("How many file you want to create:");
	      int n=sc.nextInt();
	    	  for(int i=1;i<=n;i++) 
	    	  {
	    		  file_create();
	    	  }}
	      break;
	      case 2:file_write();
	      break;
	      case 3:file_read();
	      
	      break;
	      case 4:file_delete();
	     break;
	      default:
	    System.out.println(" Please Enter Vaild Input");
		 }
       System.out.println("\nDo you want to more operation for file:  Y/N");
			 ans = sc.next().charAt(0); 
		     }
		while(ans == 'y'|| ans =='Y');// do loop when ans of user is yes
	}	
}

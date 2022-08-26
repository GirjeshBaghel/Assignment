/*Write a Java Program to Create a new text file and read the input from the user Name, Phone No, Bank name , 
Account No, Type of Account ,Amount for FD, Duration for FD , Calculate the amount and display the final amount. 
Save the input in the text file and also store the FD information.*/
package InputOutput;
import java.io.*;
import java.util.Scanner;

public class User_Data {
	
	Scanner sc = new Scanner(System.in);
	String file,name,bn,at,ph,ac;
	//long ph,ac;
	int t;
	float r,si,p;
	public void accept() throws IOException
	{
		///System.out.print("Enter the File Location and File Name here : ");
		//file = sc.nextLine().trim();
		File f1 = new File("D:\\FileUpload\\File_Data.txt");
		f1.createNewFile();
		FileWriter fw = new FileWriter(f1);
		System.out.print("Name : ");
		name = sc.nextLine();
		fw.write("Name : "+name);
		
		System.out.print("Phone No : ");
		ph = sc.nextLine();
		fw.write("\nPhone No : "+ph);
		
		System.out.print("Bank Name : ");
		bn = sc.nextLine();
		fw.write("\nBank Name : "+bn);
		
		System.out.print("Account No : ");
		ac = sc.nextLine();
		fw.write("\nAccount No : "+ac);
		
		System.out.print("Account Type : ");
		at = sc.nextLine();
		fw.write("\nAccount Type : "+at);
		
		System.out.print("Amount : ");
		p = sc.nextFloat();
		fw.write("\nAmount : "+p);
		
		System.out.print("Rate : ");
		r = sc.nextFloat();
		fw.write("\nRate : "+r);
		
		System.out.print("Time : ");
		t = sc.nextInt();
		fw.write("\nAmount : "+t);
		
		 si = p*(1+(r*t))/100;
		fw.write("\nInterest  : "+si);
		fw.write("\n Total Amount : "+(p-si));
		
		fw.close();
		System.out.println("Success");
		
	}
	void file_read() throws IOException
	{
		File f1 = new File("D:\\FileUpload\\File_Data.txt");
		FileReader fr = new FileReader(f1);
		  int i=0; 
		   while((i=fr.read()) != -1)
		   {
			   System.out.print((char)i); 
		   }
		   fr.close();
		
	}

	public static void main(String[] args) throws Exception 
	{
		User_Data ob = new User_Data();
		ob.accept();
		ob.file_read();
		
	}

}

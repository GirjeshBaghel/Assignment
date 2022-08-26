/*Write a Java Program to Create a new text file and read the input from the user Name, Phone No, Bank name , 
Account No, Type of Account ,Amount for FD, Duration for FD , Calculate the amount and display the final amount. 
Save the input in the text file and also store the FD information.*/
package InputOutput;
import java.io.*;
import java.util.Scanner;

public class User_Data {
	
	Scanner sc = new Scanner(System.in);                    		// class level variable
	String file,name,bn,at,ph,ac;
	int t;
	float r,si,p;
	public void accept() throws IOException					// accepting the from user
	{
		File f1 = new File("D:\\FileUpload\\File_Data.txt");		// creating a new file
		f1.createNewFile();
		FileWriter fw = new FileWriter(f1);				// writing that data into a file
		System.out.print("Name : ");					// taking a name from user
		name = sc.nextLine();
		fw.write("Name : "+name);
		
		System.out.print("Phone No : ");				// taking a phone no from user
		ph = sc.nextLine();
		fw.write("\nPhone No : "+ph);
		
		System.out.print("Bank Name : ");				// taking a bank name from user
		bn = sc.nextLine();
		fw.write("\nBank Name : "+bn);
		
		System.out.print("Account No : ");				// taking a account no from user
		ac = sc.nextLine();
		fw.write("\nAccount No : "+ac);
		
		System.out.print("Account Type : ");				// taking a account type from user
		at = sc.nextLine();
		fw.write("\nAccount Type : "+at);
		
		System.out.print("Amount : ");					// taking a amount from user
		p = sc.nextFloat();
		fw.write("\nAmount : "+p);
		
		System.out.print("Rate : ");					// taking a per rate from user
		r = sc.nextFloat();
		fw.write("\nRate : "+r);
		
		System.out.print("Time : ");					// taking a time from user
		t = sc.nextInt();
		fw.write("\nAmount : "+t);
		
		 si = p*(1+(r*t))/100;						// calculating the intertest of that amount
		fw.write("\nInterest  : "+si);
		fw.write("\n Total Amount : "+(p-si));				// after cut the interest total amount will be show
		
		fw.close();
		System.out.println("Success");
		
	}
	void file_read() throws IOException					// read method 
	{
		File f1 = new File("D:\\FileUpload\\File_Data.txt");		// reading a perticular file here
		FileReader fr = new FileReader(f1);
		  int i=0; 
		   while((i=fr.read()) != -1)					// reading the file when file will not be finish
		   {
			   System.out.print((char)i); 
		   }
		   fr.close();
		
	}

	public static void main(String[] args) throws Exception 		// main method
	{
		User_Data ob = new User_Data();			
		ob.accept();							// calling accept method
		ob.file_read();							// calling file read method
		
	}

}

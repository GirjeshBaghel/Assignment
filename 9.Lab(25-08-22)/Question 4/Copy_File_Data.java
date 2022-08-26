/*WAP to read the content from one file and write it into another file*/
package InputOutput;
import java.io.*;
import java.util.Scanner;

public class Copy_File_Data {
static String write_filename,read_filename;
static Scanner sc=new Scanner(System.in);

//main method
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		read_write();
	}

	/*************************************/
	
	//creating file to read one file and write to another file method with throws exception
	public static void read_write()  {
		// print the read file name
	System.out.println("Enter your file name to read the data:");
	read_filename=sc.nextLine();
	File inf=new File("C:\\Users\\shubham\\Desktop\\anudip\\"+read_filename);
	// print the write file name
	System.out.println("Enter your file name to write the data:");
	write_filename=sc.nextLine();
	File outf=new File("C:\\Users\\shubham\\Desktop\\anudip\\"+write_filename);
	// condition to take one file data and write it into another file
	  FileReader ins = null;  
	  FileWriter outs = null;
    // using try catch block to handle the exception
	  try {  
	   ins = new FileReader(inf);  
	   outs = new FileWriter(outf);  
	   int ch;  
	   while ((ch = ins.read()) != -1) {  
	    outs.write(ch);  
	   }  
	  } catch (IOException e) {  
	   System.out.println(e);  
	   System.exit(-1);  
	  } finally {  
	   try {  
	    ins.close();  
	    outs.close();  
	   } catch (IOException e) {
		   
	   } 
	   System.out.println("\nFile data is copied form ("+read_filename+") file to ("+write_filename+") file");
	  }  
	 }  
	}   
		

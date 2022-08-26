//Write a program to implement the use of singleton class
package InputOutput;
import java.util.Scanner;

public class Singletone_Class
{
	
    private static Singletone_Class s = null;		// static variable s of type Singleton having null value 		
    public String str; 
    
    private Singletone_Class()				// create private constructor of class
    {	   
     	str = "Hello! This is a java program.\n In this we create a single tone class"; 		 // store the string value
    }
    public static Singletone_Class getInstance()	//Static method to create instance of Singleton class
    {
	     if (s == null)
	     s = new Singletone_Class();
	     return s;
    }
 }

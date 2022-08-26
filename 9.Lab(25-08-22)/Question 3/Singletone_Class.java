/*Q3)Write a program to implement the use of singleton class
*/
package Aug_25;

import java.util.Scanner;

public class Singletone_Class {
	// static variable s of type Singleton having null value 
	private static Singletone_Class s = null;
    public String str; 
    // create private constructor of class
    private Singletone_Class()
      {// store the string value
     str = "Hello! This is a java program.\n In this we create a single tone class";
    }
    
    
    //Static method to create instance of Singleton class
    public static Singletone_Class getInstance()
    {
     if (s == null)
     s = new Singletone_Class();
     return s;
    }
  }

//Write a program to create the chained exception where one exception describes the cause of another exception.
package Revision;
import java.io.IOException;
import java.util.Scanner;

public class Chained_Exception {
	Scanner sc = new Scanner(System.in);						// class variable
	int a,b;
	
	void accept()									// accept method that accept the value 
	{
		System.out.print("Enter A value : ");
		a = sc.nextInt();							// storing a value
		System.out.print("Enter B value : ");
		b = sc.nextInt();							// storing  b value
		try {									// try block to handle the exception
			if(b==0)							// if b =0 then throw exception
			{
			    ArithmeticException ae = new ArithmeticException();		// creating a exception
			    ae.initCause(new IOException());				// object of arithmetic exception creaing a another exception
			    throw ae;
			}
			else
				System.out.println("Division : "+a/b);			// if b !=0 then divide the value
		}
		catch(ArithmeticException ae)						// catch the exception
		{
			System.out.println("Caught : "+ae);				// print the caught exception
			System.out.println("Actual : "+ae.getCause());			// print the actual exception
		}
		
	}

	public static void main(String[] args) 						// main method
	{
		Chained_Exception ob =new Chained_Exception();				// creating a object
		ob.accept();								// calling a accept method
	}

}

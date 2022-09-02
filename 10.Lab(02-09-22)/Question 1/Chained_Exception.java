//Write a program to create the chained exception where one exception describes the cause of another exception.
package Revision;
import java.io.IOException;
import java.util.Scanner;

public class Chained_Exception {
	Scanner sc = new Scanner(System.in);
	int a,b;
	
	void accept()
	{
		System.out.print("Enter A value : ");
		a = sc.nextInt();
		System.out.print("Enter B value : ");
		b = sc.nextInt();
		try {
			if(b==0)
			{
				ArithmeticException ae = new ArithmeticException();
				ae.initCause(new IOException());
				throw ae;
			}
			else
				System.out.println("Division : "+a/b);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Caught : "+ae);
			System.out.println("Actual : "+ae.getCause());
		}
		
	}

	public static void main(String[] args) 
	{
		Chained_Exception ob =new Chained_Exception();
		ob.accept();
	}

}

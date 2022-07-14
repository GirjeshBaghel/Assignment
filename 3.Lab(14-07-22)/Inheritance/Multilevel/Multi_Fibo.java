//WAP to create a class for Fibonacci series, second class Palindrom No , Third class use both the class property and display the output
package Revision;
import java.util.Scanner;

// Main class 
public class Multi_Fibo {
	// global variable to use inherit classes 
	Scanner sc = new Scanner(System.in);
    int n1, n2,n3,count,n,r,temp,sum=0;
	
    // fibo method
    public  void fibo()
	    {	        
	        // asking the starting value and last value
	        System.out.print("Please enter the two value for Fibonacci Series : ");
	        n1 = sc.nextInt();
	        n2 = sc.nextInt();
	        System.out.println(" Your starting value is : "+n1+"   Your Ending value is : "+n2);
	        
	        // asking the no of count that loop will be run
	        System.out.println("Please enter the Counting value : ");
	        count = sc.nextInt();
	        for(int i=2 ; i<count; ++i)
	        {
	            // adding the stating value and last value
	            n3 = n1+n2;
	            System.out.print(" "+n3);
	            // interchange value
	            n1 = n2;
	            n2 = n3;
	        }
	    }
}

package Revision;

import java.util.Scanner;

public class FIbonacci_Series extends Thread{
	//global variable declaration  
	Scanner sc = new Scanner(System.in);
    int n1, n2,n3,i,j ,temp=0;
	int[] arr = new int[10];
	public void run()
	{
        
        // taking the two values from user
        System.out.print("Please enter the two value for Fibonacci Series : ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        System.out.println(" Your starting value is : "+n1+"   Your Ending value is : "+n2);  // starting value or last value
               
        
        for(int i=2 ; i<10; ++i) // loop run for 10 times only
        {
            // adding the stating value and last value
            n3 = n1+n2;
            try {
            	sleep(1000); // sleeping the thread for 1 sec
            }catch(Exception e) {
            	System.out.println(e);
            }
            System.out.print(" "+n3);
            // interchange value
            n1 = n2;
            n2 = n3;
        }
	}

}

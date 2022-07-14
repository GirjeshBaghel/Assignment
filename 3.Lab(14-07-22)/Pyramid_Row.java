//WAP to accept no rows from the user and accordingly display the pyramid.
package Revision;

import java.util.Scanner;

public class Pyramid_Row {
	
	// pymd method called by inside main method
	public void pymd()
	{
		Scanner sc = new Scanner(System.in);
		 
		int i,j,row,count=1;
		// Taking rows from user
        System.out.println("Enter the no of Rows here : ");
        
        row = sc.nextInt();
        count = 1;
        
        // Printing Pyramid
        System.out.println("Here Is Your Pyramid");
 
        for (i = row; i > 0; i--)
        {
        	// loop for giving column spaces
            for (j = 1; j <= i*2; j++)
            {
                System.out.print(" ");
            }
            
            // printing j increment value
            for (j = 1; j <= count; j++)          
            {
                System.out.print(j+" ");
            }
             
            //printing j decrement value
            for (j = count-1; j >= 1; j--)
            {               
                System.out.print(j+" ");            
            }                       
             
            // Line break
            System.out.println();
  
            count++;
        }

	}

	// main method
	public static void main(String[] args)
    {
		Pyramid_Row ob = new Pyramid_Row();
		// calling pymd method 
		ob.pymd();
    }
}

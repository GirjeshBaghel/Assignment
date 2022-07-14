//WAP to accept no rows from the user and accordingly display the pyramid.
package Revision;

import java.util.Scanner;

public class Pyramid_Row {

	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter the no of Rows here : ");
 
        int row = sc.nextInt();
        int count = 1;
 
        System.out.println("Here Is Your Pyramid");
 
 
        for (int i = row; i > 0; i--)
        {
 
            for (int j = 1; j <= i*2; j++)
            {
                System.out.print(" ");
            }
  
            for (int j = 1; j <= count; j++)          
            {
                System.out.print(j+" ");
            }
             
            for (int j = count-1; j >= 1; j--)
            {               
                System.out.print(j+" ");            
            }                       
             
            System.out.println();
  
            count++;
        }
    }
}

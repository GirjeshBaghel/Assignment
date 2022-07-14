//"Write a Java program to print an array after changing the rows and columns of a given two-dimensional array.
package Revision;

import java.util.Scanner;

public class Array_Chng {

	// rev method
	public void rev()
	{
		int i,j;
		Scanner sc = new Scanner(System.in);
		int row,col;
		
		// taking rows and column from user
		System.out.print("Enter the no of row : ");
		row = sc.nextInt();
		System.out.print("Enter the no of coloum : ");
		col = sc.nextInt();
		
		// Taking array from user
		System.out.println("Enter array : ");
		int arr[][] = new int[row][col];
		for(i=0; i<row; i++)
		{
			for(j=0; j<col; j++)
			{
				//Taking array from user
				arr[i][j] = sc.nextInt();
				
			}
			
		System.out.println();
		}
		
		//Taking new 2 dimensional array
		int tran[][] = new int[row][col];
		
		//Checking the conditions row or equal or not
		if(row == col)
		{
			for(i=0; i<row; i++)
			{
				for(j=0; j<col; j++)
				{
					// If they equal then arr[][] values transfers to tran[][] array
					tran[i][j] = arr[j][i];
										
				}
				
			}
			
			// After transfer array then printing process
			for(i=0; i<row; i++)
			{
				for(j=0; j<col; j++)
				{
					System.out.println(tran[i][j]);
				}
				System.out.println();
			}
		}
		
		// If they are not equal then arr[i] to arr[j] interchange the values
		else 
		{
			for(i=0; i<col; i++)
			{
				for(j=0; j<row; j++)
				{
					// printing arr values 
					System.out.print(arr[j][i]+" ");
				}
				System.out.println();
			}
		}
		

	}
	
	// main method
	public static void main(String[] args) {
		Array_Chng ob = new Array_Chng();
		
		//calling rev method
		ob.rev();
		
	}

}

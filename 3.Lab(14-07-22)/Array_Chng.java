//"Write a Java program to print an array after changing the rows and columns of a given two-dimensional array.
package Revision;

import java.util.Scanner;

public class Array_Chng {

	
	public static void main(String[] args) {
		int i,j;
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row,col;
		System.out.print("Enter the no of row : ");
		row = sc.nextInt();
		System.out.print("Enter the no of coloum : ");
		col = sc.nextInt();
		
		System.out.println("Enter array : ");
		int arr[][] = new int[row][col];
		for(i=0; i<row; i++)
		{
			for(j=0; j<col; j++)
			{
				arr[i][j] = sc.nextInt();
				
			}
			
		System.out.println();
		}
		
		int tran[][] = new int[row][col];
		
		if(row == col)
		{
			for(i=0; i<row; i++)
			{
				for(j=0; j<col; j++)
				{
					tran[i][j] = arr[j][i];
										
				}
				
			}
			
			for(i=0; i<row; i++)
			{
				for(j=0; j<col; j++)
				{
					System.out.println(tran[i][j]);
				}
				System.out.println();
			}
		}
		else 
		{
			for(i=0; i<col; i++)
			{
				for(j=0; j<row; j++)
				{
					System.out.print(arr[j][i]+" ");
				}
				System.out.println();
			}
		}
		

	}

}


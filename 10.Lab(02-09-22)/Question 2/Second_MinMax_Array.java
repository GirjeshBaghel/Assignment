//Write a program to find second minimum and second maximum number from the array .
package Revision;
import java.util.Scanner;

public class Second_MinMax_Array {
	Scanner sc = new Scanner(System.in);						// class level variable
	int size,i,min;
	
	void accept()									// accept method
	{	
		System.out.print("Enter the Size of Array : ");				// taking a size of array
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter the elements of Array : ");		
		for(i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();						// storing a array in a for loop
		}
		
		System.out.print("Yours Arrays are : ");
		for(i=0; i<size; i++)
		{
			System.out.print(arr[i]+" ");					// printing the array that user enter
		}
		min = arr[1];								//passing array second value to the min variable
		for(i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] >arr[j])		
				{
					min = arr[i];					// sorting a array in asscending order
					arr[i] = arr[j];
					arr[j] = min;
				}
			}
		}
		System.out.println("\nSecond Minimum Value :"+arr[1]);			// print the array second value after a sorting
		System.out.println("Second Maximum Value :"+(arr[arr.length-2]));	// print the array second last value after a sorting
		
	}
	
	public static void main(String[] args)						// main method
	{
		Second_MinMax_Array ob = new Second_MinMax_Array();			// creating a object of class
		ob.accept();								// calling a accept method
	}

}

//Write a program to find second minimum and second maximum number from the array .
package Revision;
import java.util.Scanner;

public class Second_MinMax_Array {
	Scanner sc = new Scanner(System.in);
	int size,i,min;
	
	void accept()
	{
		System.out.print("Enter the Size of Array : ");
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter the elements of Array : ");		
		for(i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Yours Arrays are : ");
		for(i=0; i<size; i++)
		{
			System.out.print(arr[i]+" ");
		}
		min = arr[1];
		for(i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] >arr[j])
				{
					min = arr[i];
					arr[i] = arr[j];
					arr[j] = min;
				}
			}
		}
		System.out.println("\nSecond Minimum Value :"+arr[1]);
		System.out.println("Second Maximum Value :"+(arr[arr.length-2]));
		
	}
	
	public static void main(String[] args)
	{
		Second_MinMax_Array ob = new Second_MinMax_Array();
		ob.accept();
	}

}

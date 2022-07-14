package Revision;

public class Multi_Pali extends Multi_Fibo{
	public void pali()
	{
		
	
		System.out.print("Enter a no : ");
		n = sc.nextInt();
		temp = n;
		while(n>0)
		{
			r = n%10;
			sum = (sum*10)+r;
			n = n/10;
		}
		if(temp == sum)
		{
			System.out.println("This is Palidorm no : ");
		}
		else
			System.out.print("This is not a palidorm no : ");
		
	}

}

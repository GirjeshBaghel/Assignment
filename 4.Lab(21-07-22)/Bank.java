package Revision;

import java.util.Scanner;

public class Bank  extends User_Details{
	  static Scanner sc = new Scanner(System.in);
	char cont = 'y';
	static int choice,pin1,with,depo,bal=500;
	User_Details t = new User_Details();
	
	public void details()
	{
		do {
		System.out.println("\tWelcome to the Electronical Fund Trasfer Machine\t");
		System.out.print("Enter your Bank Name Here : ");
		setBank(sc.next());
		System.out.print("Enter your Account no : ");
		setAccount(sc.nextLong()); 
		
		System.out.print("Enter your Name here : ");
		setName(sc.next());		
		
		System.out.print("Enter your Phone No :");
		setPh(sc.nextLong());
		
		System.out.print("Enter Your Pin no : ");
		setPin(sc.nextInt());
		
		if(getPin() == 1234)
		{
			System.out.println("Enter your choose here.");
			System.out.println("1.Withdrwal \n2.Deposit \n3.Balance");
			choice = sc.nextInt();
			if(choice == 1)
			{
				withdraw();
			}
			else if(choice == 2)
			{
				deposit();
			}
			else if(choice == 3)
			{
				bal = depo-with;
				System.out.println("Bank Name : "+t.getBank());
				System.out.println("Account No : "+t.getAccount());
				System.out.println("Your Balance is : "+bal);
			}
			else
			{
				System.out.println("Please enter correct choice.. ");
			}
			
			System.out.print("\nDo you want to continue (y/n) ? ");
			cont = sc.next().charAt(0);
		}
		else
		{
			System.out.println("Wrong pin..");
		}
		System.out.print("\nDo you want to continue (y/n) ? ");
		cont = sc.next().charAt(0);
		}
		
		// checking conditions that user wants to continue or not
		while(cont == 'y' || cont == 'Y');
		
		
	}
	
	public static  void withdraw()
	{
		System.out.print("Enter the amount : ");
		with = sc.nextInt();
		if(bal>with)
		{
			System.out.println("Your Remaing Balance  : "+(bal-with));
		}
		else {
			System.out.println("Sorry !!! Not Sufficent Balance in your Accont ... ");
		}
		
	}
	
	public void deposit()
	{
		System.out.print("Enter the amount : ");
		depo = sc.nextInt();
		
		
		System.out.println("Your Total Balance  : "+(bal+depo));
				
		
	}
	
}

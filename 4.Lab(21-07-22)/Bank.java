package Revision;


public class Bank  extends User_Details{
	
	// details method calling by the another class
	public void details()
	{
		// do while loop
		do {
		System.out.println("\tWelcome to the Electronical Fund Trasfer Machine\t");
		
		// taking bank name from user
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
		
		// checking pin from user
		if(getPin() == 1234)
		{
			System.out.println("Enter your choose here.");
			System.out.println("1.Withdrwal \n2.Deposit \n3.Balance");
			choice = sc.nextInt();
			// switch case to user choice
			switch(choice)
			{
			 case '1':
				withdraw();
			 case '2':
				 deposit();
			 case '3':
				 balance();
				default:
					System.out.println("Invalid Choice..");
			}
			
		}
		// if pin is wrong then else part run
		else
		{
			System.out.println("Wrong pin..");
		}
		
			System.out.print("\nDo you want to continue (y/n) ? ");
			cont = sc.next().charAt(0);
		}		
		
		while(cont == 'y' || cont == 'Y'); // checking conditions that user wants to continue or not
		
	}
	
	// withdraw method calling inside the switch
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
	// balance method calling inside the switch
	public static void balance()
	{
		bal = depo-with;
		System.out.println("Your Balance is : "+bal);
	}
	// deposit method calling inside the switch
	public static void deposit()
	{
		System.out.print("Enter the amount : ");
		depo = sc.nextInt();
		System.out.println("Your Total Balance  : "+(bal+depo));
	}
	
}

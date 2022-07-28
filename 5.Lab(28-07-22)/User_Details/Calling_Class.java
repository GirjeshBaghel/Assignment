//Write a program to accept basic details name , Phone No , Address , user Id and password from the user .throw an exception if 
//the user Id lenght is greater than 8 and password is not matched and should only contain the string value.
package Revision;

public class Calling_Class  extends Data_Class{
	
	
	public void details()
	{
		System.out.println("Enter the Details Here.");
		System.out.print("Name : ");
		name = sc.next();
		
		System.out.print("Phone No  : ");
		ph = sc.next();
		
		System.out.print("Address : ");
		add = sc.next();
		
		id();			
		
	}
	public void id()
	{
		System.out.print("Id : ");
		try {
			ide = sc.next();
			setId(ide);
			if(ide.length() != 6)
			{
				throw new User_Excep("Enter the Valid Id here .");	
			}
			else
			{
					password();		
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("The ID Shoud be maximun 6 length.");
			System.exit(0);
		}
		
	}
	public void password()
	{
		System.out.print("1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits \n"); 
               s = sc.next();
               setPassword(s);
			try {
				if (is_Valid_Password(s)) {
		            System.out.println("Password is valid: " + s);
		            showing();
		        } else {
		        	throw new User_Excep("Not a valid password: ");
		           }
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		
	}	
		public static boolean is_Valid_Password(String password) {

	        if (password.length() < PASSWORD_LENGTH) return false;

	        int charCount = 0;
	        int numCount = 0;
	        for (int i = 0; i < password.length(); i++) {

	            char ch = password.charAt(i);

	            if (is_Numeric(ch)) numCount++;
	            else if (is_Letter(ch)) charCount++;
	            else return false;
	        }


	        return (charCount >= 2 && numCount >= 2);
	    }

	    public static boolean is_Letter(char ch) {
	        ch = Character.toUpperCase(ch);
	        return (ch >= 'A' && ch <= 'Z');
	    }


	    public static boolean is_Numeric(char ch) {

	        return (ch >= '0' && ch <= '9');
	    }

    
	
	public void showing()
	{
		System.out.println("Your Name : "+name);
		System.out.println("Your Phone No : "+ph);
		System.out.println("Your Address : "+add);
		System.out.println("Your Id : "+getId());
		System.out.println("Your Password : "+getPassword());
		
	}
	
	public static void main(String[] args)
	{
		Calling_Class ob = new Calling_Class();
		ob.details();
	}

}

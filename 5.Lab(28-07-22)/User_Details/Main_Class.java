//Write a program to accept basic details name , Phone No , Address , user Id and password from the user .throw an exception if 
//the user Id length is greater than 8 and password is not matched and should only contain the string value.
package Ecap_Check;

public class Main_Class extends Variable_Class{

	
	
	public void details()	// details method calls inside the main method
	{
		// taking the details from user
		System.out.println("Enter the Details Here.");
		System.out.print("Name : ");
		name = sc.next();
		
		System.out.print("Phone No  : ");
		ph = sc.next();
		
		System.out.print("Address : ");
		add = sc.next();
		
		user_id(); // user_id method calls			
		
	}
	public void user_id()
	{
		System.out.print("Id : "); // taking id from the user
		try {
			setId(sc.next());
			if(getId().length() != 6) // checking the length of id is 6 or not
			{
				throw new User_Excep("Enter the Valid Id here ."); // if length is not equal to 6 then throw an exception	
			}
			else
			{
					user_pass(); // if all the things true then user_pass method calls		
			}
		}
		catch(Exception e) // if exception will be generate then catch block handle  
		{
			System.out.println(e);
			System.out.println("The ID Shoud be maximun 6 length.");
			System.exit(0);
		}
		
	}
	public void user_pass() // user_pass method call inside the useer_id method
	{
		// Password conditions here
		System.out.print("1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits \n"); 
               
               setPassword(sc.next());
			try {
				if (is_Valid_Password(getPassword())) // is_Valid_Password method calls
				{
		            		System.out.println("Password is valid: " + getPassword());
		            		showing();
		        	}	 
				else {
		        	throw new User_Excep("Not a valid password: "); // if is_Valid_Password method will carry false then throw a exception
		           }
			}
			catch(Exception e1) 
			{
				System.out.println(e1);
			}
		
	}	
		public static boolean is_Valid_Password(String password) { // this method checking all the conditions of password
		
		// if password length is not equal to password_length then return a false
	        if (password.length() < PASSWORD_LENGTH) return false;

	        int charCount = 0;
	        int numCount = 0;
		// checking each character of a password by the loop	
	        for (int i = 0; i < password.length(); i++) {

	            char ch = password.charAt(i);
			
	            if (is_Numeric(ch)) numCount++;
	            else if (is_Letter(ch)) charCount++;
	            else return false;
	        }

		// return statement
	        return (charCount >= 2 && numCount >= 2);
	    }
	    // checking the letter here
	    public static boolean is_Letter(char ch) {
	        ch = Character.toUpperCase(ch);
	        return (ch >= 'A' && ch <= 'Z');
	    }

	    // checking the numeric value
	    public static boolean is_Numeric(char ch) {

	        return (ch >= '0' && ch <= '9');
	    }


    
	// if all the things true then showing method will be call
	public void showing()
	{
		System.out.println("Your Name : "+name);
		System.out.println("Your Phone No : "+ph);
		System.out.println("Your Address : "+add);
		System.out.println("Your Id : "+getId());
		System.out.println("Your Password : "+getPassword());
		
	}
	
	// main method
	public static void main(String[] args)
	{
		Main_Class obj = new Main_Class();
		obj.details();
	}

}



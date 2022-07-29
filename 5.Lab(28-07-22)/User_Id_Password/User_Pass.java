package Revision;

import java.util.Scanner;

public class User_Pass {
	String id,s; 
	private  String password,user_Id;
	
	static int pass_length=9;
	 Scanner sc= new Scanner(System.in);
	
	public void accept() {  //class for accepting the id from user
	
		System.out.println("Enter your user id :");
		System.out.println("The should be in 6 digit :");
		
		try {   // try block to check the exception
			s = sc.next();
			if(s.length() != 6)
			{
				throw new Exception("Enter the Valid Id here .");	
			}
			else
			{
					password();		
			}
		}
		catch(Exception e) // if exception will be occur then catch will be handel
		{
			System.out.println(e);
			System.out.println("The ID Shoud be maximun 6 length.");
			System.exit(0);
		}
				
	}
	
	// class for password
		public void password()
		{
			// password condtions 
			System.out.println("Password should not contain any space.\n"
					+ "Password should contain at least one digit(0-9).\n"
					+ "Password length should be between 0 to 9 characters.\n"
					+ "Password should contain at least one lowercase letter(a-z).\n"
					+ "Password should contain at least one uppercase letter(A-Z).\n"
					+ "Password should contain at least one special character ( @, #, %, &, !, $, etc….)."); 
	               s = sc.next();
	               
				try { // try catch for password
					if (is_Valid_Password(s)) {
			            System.out.println("Password is valid: " + s);
			            show();
			        } else {
			        	throw new Exception("Not a valid password: ");
			           }
				}
				catch(Exception e1)
				{
					System.out.println(e1);
				}
			
		}	
		// class for checking the condition for space
		public static boolean space(String password) {
		if (password.contains(" ")) { // condition for space
            return false;
		}
		return false;
		}
		// class for checking the condition for password length
			public static boolean is_Valid_Password(String password) {

		        if (password.length() < pass_length) return false;// condition for length of password

		        int charCount = 0;
		        int numCount = 0;
		        for (int i = 0; i < password.length(); i++) {
		            char ch = password.charAt(i);
		            if (is_Numeric(ch)) numCount++;// condition for number of password contain digit
		            else if (up_Letter(ch)) charCount++;// condition for character are in upper case
		            else if (lo_Letter(ch)) charCount++;// condition for character are in lower case
		            else if((password.contains("@") || password.contains("#") // condition for special character
			                 || password.contains("!") || password.contains("~")
			                 || password.contains("$") || password.contains("%")
			                 || password.contains("^") || password.contains("&")
			                 || password.contains("*") || password.contains("(")
			                 || password.contains(")") || password.contains("-")
			                 || password.contains("+") || password.contains("/")
			                 || password.contains(":") || password.contains(".")
			                 || password.contains(", ") || password.contains("<")
			                 || password.contains(">") || password.contains("?")
			                 || password.contains("|")));
		            else return false; // character if nothing is true
		        }
		        return (charCount >= 2 && numCount >= 2);
		    }
			// class for checking the condition for password letter in capital letter
		    public static boolean up_Letter(char ch) {
		        ch = Character.toUpperCase(ch);
		        return (ch >= 'A' && ch <= 'Z');
		    }
			// class for checking the condition for password letter in small letter
		    public static boolean lo_Letter(char ch) {
		        ch = Character.toLowerCase(ch);
		        return (ch >= 'a' && ch <= 'z');
		    }

		 // class for checking the condition for password number
		    public static boolean is_Numeric(char ch) {

		        return (ch >= '0' && ch <= '9');
		    }
		    
		    public void show() // show method call when all the conditions will be true
			{
				
				System.out.println("Your Id : "+user_Id);
				System.out.println("Your Password : "+password);
				
			}

}


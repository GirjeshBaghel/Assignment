package String;
import java.util.Scanner;

public class String_Palindrom {
	Scanner sc = new Scanner(System.in);
	String st,rev="";
	char ch;
	
	public void accept()
	{
		System.out.print("Enter a String : ");
		st = sc.nextLine();
		st = st.toLowerCase();
		for(int i=0; i<st.length(); i++)
		{
			ch = st.charAt(i);
			rev = ch+rev;
		}
		
		if(st.equals(rev))
		{
			System.out.println("It is Palindrom String : "+rev);
		}
		else
			System.out.println("Not a Palindrom String : "+st);
				
	}
	
	public static void main(String[] args) {
		
		String_Palindrom ob = new String_Palindrom();
		ob.accept();
	}

}

package String;
import java.util.Scanner;

public class String_Permutation 
{
	 static Scanner sc = new Scanner(System.in);
	public static void demo(String s1,String s2)
	{
	if(s1.length() == 0)
    {
        System.out.println(s2);
    }
    for(int i=0 ; i<s1.length() ; i++)
    {
        char ch = s1.charAt(i);
        String ls = s1.substring(0,i);
        String rs = s1.substring(i+1);
        String rest = ls + rs;
        demo(rest , s2+ch);
    }
}

public static void main(String[] args) 
{
	
	System.out.print("Enter a String : ");
	String st = sc.nextLine();
	String st2= "";
	demo(st,st2);

}
}

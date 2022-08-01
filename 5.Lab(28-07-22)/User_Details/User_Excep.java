package Ecap_Check;

// this is exception class that handle the another class exception 
public class User_Excep  extends Exception{
	
	User_Excep(String msg) // constractor calling by the another class
	{
		super(msg); // passing the message for super class
	}
}

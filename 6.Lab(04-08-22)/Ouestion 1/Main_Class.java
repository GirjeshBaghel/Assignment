package Revision;
 // the output of this program can't be terminte in exclipse by the key in cmd run properly
public class Main_Class { 
	
	// main method
	public static void main(String[] args)
	{
		Thread_Infinity ob = new Thread_Infinity("ACTIVE"); // passing the argument to the constructor
		Thread_Infinity ob1 = new Thread_Infinity("UNACTIVE"); // passing the argument to the constructor
		System.out.println("Display Output Here..");
		ob.start(); // calling the run method
		ob1.start(); // calling the run method
	}
}

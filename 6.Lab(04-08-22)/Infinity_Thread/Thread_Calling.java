/*Write a program that creates 2 threads - each displaying a message (Pass the message as a parameter to the constructor). 
The threads should display the messages continuously till the user presses any key.
*/
package Revision;
public class Thread_Calling { 
	
	// main method
	public static void main(String[] args)
	{
		Thread_Continue ob = new Thread_Continue("ACTIVE"); // passing the argument to the constructor
		Thread_Continue ob1 = new Thread_Continue("UNACTIVE"); // passing the argument to the constructor
		System.out.println("Display Output Here..");
		ob.start(); // calling the run method
		ob1.start(); // calling the run method
	}
}
 // the output of this program can't be terminte in exclipse by the key in cmd run properly

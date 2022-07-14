// WAP where one class taking data and second class Sum ,class Mul,class Div,class Sub, class Mod. These classes taking input from data class
package Revision;

// Modulas class
public class Heirac_Mod extends Heirac_Data {

	// mod method that call by main method
	public void mod()
	{
		// Taking input from main class
		accept();
		// Printing Division here 
		System.out.print("Modulas : "+(a%b));
	}
	
	// main method
	public static void main(String[] args) 
	{		
		Heirac_Mod ob = new Heirac_Mod();
		ob.mod();
	}
}

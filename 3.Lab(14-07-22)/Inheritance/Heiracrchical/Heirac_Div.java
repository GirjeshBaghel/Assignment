// WAP where one class taking data and second class Sum ,class Mul,class Div,class Sub, class Mod. These classes taking input from data class
package Revision;

// Divison Class
public class Heirac_Div extends Heirac_Data {
	public void div()
	{
		// Taking input from main class
		accept();
		// Printing Division here 
		System.out.print("Division : "+(a/b));
	}
	// main method
	public static void main(String[] args) 
	{
		Heirac_Div ob = new Heirac_Div();
		ob.div();
	}
}

// WAP where one class taking data and second class Sum ,class Mul,class Div,class Sub, class Mod. These classes taking input from data class
package Revision;

//Add class
public class Heirac_Sum extends  Heirac_Data{

	// sum method
	public void sum()
	{
		// Taking input from input class
		accept();
		// Printing Addition here
		System.out.print("Sum : "+(a+b));
	}
	// main method
	public static void main(String[] args) {
		
		Heirac_Sum ob = new Heirac_Sum();
		ob.sum();
	}

}

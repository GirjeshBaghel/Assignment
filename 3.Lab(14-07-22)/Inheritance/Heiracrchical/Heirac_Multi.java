// WAP where one class taking data and second class Sum ,class Mul,class Div,class Sub, class Mod. These classes taking input from data class
package Revision;

// Multiplication class
public class Heirac_Multi extends  Heirac_Data{
	public void mul()
	{
		// Taking input from main class
		accept();
		// Printing Multiplication here 
		System.out.print("Multiplication : "+(a*b));
	}
	// main method
	public static void main(String[] args) {
		
		Heirac_Multi ob = new Heirac_Multi();
		ob.mul();
	}
}

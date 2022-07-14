//// WAP where one class taking data and second class Sum ,class Mul,class Div,class Sub, class Mod. These classes taking input from data class
package Revision;

//Subtraction class
public class Heirac_Sub extends Heirac_Data {

	// sub method
	public void sub()
	{
		// Taking input from main class
		accept();
		// Printing Subtraction here 
		System.out.print("Subtraction : "+(a-b));
	}
	
	// main method
	public static void main(String[] args) {
		
		Heirac_Sub ob = new Heirac_Sub();
		ob.sub();
	}
}

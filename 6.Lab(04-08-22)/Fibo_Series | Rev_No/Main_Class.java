/* Write a JAVA program which will generate the threads: To display 10 terms of Fibonacci series.- To display 1 to 10 in reverse order.*/
package Revision;
// main class
public class Main_Class {

	// main method that create the object or another classes and calls the method
	public static void main(String[] args) {
		FIbonacci_Series ob = new FIbonacci_Series(); // FIbonacci_Series object creation
		Reverse_No ob1 = new Reverse_No(); // Reverse_no class object creation
		ob.start(); // calls run method
		ob1.start(); // calls run method

	}

}

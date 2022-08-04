package Revision;
class Main_Class // main class
{
	public static void main(String[] args) // main method
	{
		Problem_Class pc = new Problem_Class(); // creating object of Problem class
		Producer_Class p1 = new Producer_Class(pc, 1); // creating object of Producer_class and passing the arguments to the constructor
		Consumer_Class c1 = new Consumer_Class(pc, 2);  // creating object of Consumer_class and passing the arguments to the constructor
	      c1.start(); // calling a run method
	      p1.start(); // calling a run method
	}
}

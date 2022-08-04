package Revision;
class Main_Class
{
	public static void main(String[] args)
	{
		Problem_Class pc = new Problem_Class();
		Producer_Class p1 = new Producer_Class(pc, 1);
		Consumer_Class c1 = new Consumer_Class(pc, 1);
	      c1.start();
	      p1.start();
	}
}

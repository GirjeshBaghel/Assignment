package Revision;

public class Consumer_Class  extends Thread {
	
	Problem_Class Shop;	//declared variable for using the class name.........
	      int num,value = 0,i;  //declared varaible and data type......
	     
	      //create construtor.............
	      public Consumer2(Problem_Class c, int number)
	      {
	            Shop = c;
	            this.num = number;//use this keyword for use the same class variable...........
	      }
	      public void run()//create run method......
	      {
	            for ( i = 0; i < 10; i++)//using the for loop
	            {
	                  System.out.println("Consumed value " + this.num+ " got: " + value);//for print
	            }
	      }

}

package Revision;
public class Producer_Class extends Thread {
	         	      //use the thread class property.......
	Problem_Class  Shop;  //declared variable for using the class name.........
      	int number;           //declared varaible and data type......
	
     public Producer_Class(Problem_Class c, int number) //create construtor and taking a paramether
     {
           Shop = c;
           this.number = number;	//use this keyword for use the same class variable
     }
     public void run()			//create run method.....
     {
           for (int i = 0; i < 10; i++)  //using  for loop....
           {
                 
                 System.out.println("Produced value " + this.number+ " put: " + i);
                 try						//use try block where exception show........
                 {
                	
                       sleep((int)(Math.random() * 100));	//sleep method of thread
                 }
                 catch (InterruptedException ie)		//catch block to handle the exception.....
                 {
                     System.out.println(ie);			//simply print the exception.......
                 }
           }
     }

}

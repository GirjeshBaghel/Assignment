package Revision;
public class Problem_Class  {  // this is problem class that carry problem according to the ques

   int materials;  // global variables here
    boolean available = false;
    public synchronized int get() // synchronized method to get a true or false
    {
          while (available == false) // while loop for false condition
          {
                try
                {
                      wait(); // if false then problem will be wait
                }
                catch (InterruptedException ie) // catching the exception
                {
                }
          }
          available = false; // material not available
          notifyAll();
          return materials; //return a material to the method
    }
    public synchronized void put(int value) // synchronized method for true conditions
    {
          while (available == true) // while loop for true condition
          {
                try
                {
                      wait(); // wait the program
                }
                catch (InterruptedException ie) // catching the Interrupted Exception here
                {
                      ie.printStackTrace();
                }
          }
          materials = value; // material available in a value
          available = true; // material available here
          notifyAll();
    }


}

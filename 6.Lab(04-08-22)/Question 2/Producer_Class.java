/*Write a Java program using Synchronized Threads, which demonstrates Producer Consumer concept.
Producer Consumer problem:
The producer-consumer problem is the classical concurrency of a multi process synchronization problem. It is also known as bound-buffer problem.
The problem describes two processes, the producer and the consumer, who share a common, fixed-size buffer used as a queue. The producer generates a piece of data, put it into the buffer and starts again.
*/
package Revision;
public class Producer_Class extends Thread {
	 Problem_Class shop;
      int number;

    Producer_Class(Problem_Class pc, int number)
     {
           shop = pc;
           this.number = number;
     }
     public void run() 
     {
    	   for (int i = 0; i < 10; i++)
           {
                 System.out.println("Produced value " + this.number+ " put: " + i);
           }
     }
	
	

}

package Revision;
public class Thread_Infinity extends Thread
{
	String str; // global variable
	Thread_Infinity(String s) // constructor taking a parameter
	{
		str = s;
	}
	
	public void run() // run method calling by the another class
	{
		
		for (;;) // infinity loop
		{
			    System.out.println((Thread.currentThread()).getName()+" "+"Message: "+str); // printing the message
	            System.out.println((Thread.currentThread()).getName()+" "+"Priority:  "+(Thread.currentThread()).getPriority()); // printing the priority here
	             
	            try
	            {
	                Thread.sleep(1000); // sleeping the thread for 1 sec
	            }
	            catch(Exception e)
	            { 
	                System.out.println(e);
	            }
	    }
	}
	
	
}

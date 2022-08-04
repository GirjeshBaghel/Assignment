package Revision;

public class Consumer_Class  extends Thread {
	
	Problem_Class Shop;
     int number,value = 0;
    Consumer_Class( Problem_Class pc, int number)
    {
          Shop = pc;
          this.number = number;
    }
    public void run()
    {
          for (int i = 0; i < 10; i++)
          {
				/*
				 * try { sleep(1000); }catch(Exception e) { System.out.println(e); }
				 */
            
                System.out.println("Consumed value " + this.number+ " got: " + value);
          }
    }

}

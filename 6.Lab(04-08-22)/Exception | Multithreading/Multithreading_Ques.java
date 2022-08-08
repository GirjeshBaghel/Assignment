 Ques 1. What's the difference between thread and process?
 Ans  1. Thread : It simply refers to the smallest units of the particular process. It has the ability to execute different parts (referred to as thread) of the program at the same time.  
 		 Process : It simply refers to a program that is in execution i.e., an active program. A process can be handled using PCB (Process Control Block).
 		 
 Ques 2. What's the difference between User thread and Daemon thread?
 Ans 2.  User and Daemon are basically two types of thread used in Java by using a ‘Thread Class’. 
 		 User Thread (Non-Daemon Thread): In Java, user threads have a specific life cycle and its life is independent of any other thread. JVM (Java Virtual Machine) waits for any of the user threads to complete its tasks before terminating it. When user threads are finished, JVM terminates the whole program along with associated daemon threads. 
 		 Daemon Thread: In Java, daemon threads are basically referred to as a service provider that provides services and support to user threads. There are basically two methods available in thread class for daemon thread: setDaemon() and isDaemon(). 

 Ques 3. How can we create daemon threads?
 Ans 3. We can create daemon threads in java using the thread class setDaemon(true). It is used to mark the current thread as daemon thread or user thread. isDaemon() method is generally used to check whether the current thread is daemon or not. If the thread is a daemon, it will return true otherwise it returns false.  

		 Example:   
			 Program to illustrate the use of setDaemon() and isDaemon() method. 
			 public class DaemonThread extends Thread 
			 { 
			    public DaemonThread(String name){ 
			        super(name); 
			    } 
			    public void run() 
			    {  
			        // Checking whether the thread is Daemon or not 
			        if(Thread.currentThread().isDaemon()) 
			        {  
			            System.out.println(getName() + " is Daemon thread");  
			        }    
			        else 
			        {  
			            System.out.println(getName() + " is User thread");  
			        }  
			    }   
			    public static void main(String[] args) 
			    {  
			        DaemonThread t1 = new DaemonThread("t1"); 
			        DaemonThread t2 = new DaemonThread("t2"); 
			        DaemonThread t3 = new DaemonThread("t3");  
			        // Setting user thread t1 to Daemon 
			        t1.setDaemon(true);       
			        // starting first 2 threads  
			        t1.start();  
			        t2.start();   
			        // Setting user thread t3 to Daemon 
			        t3.setDaemon(true);  
			        t3.start();         
			    }  
			 } 
 
 	Output 
		 	t1 is Daemon thread 
		 	t3 is Daemon thread 
		 	t2 is User thread 
	
 Ques 4. What are the wait() and sleep() methods?
 Ans 4.  wait(): As the name suggests, it is a non-static method that causes the current thread to wait and go to sleep until some other threads call the notify () or notifyAll() method for the object’s monitor (lock). It simply releases the lock and is mostly used for inter-thread communication. It is defined in the object class, and should only be called from a synchronized context. 

 		Example:  

				synchronized(monitor) 
				{ 
				monitor.wait();       Here Lock Is Released by Current Thread  
				} 
		sleep(): As the name suggests, it is a static method that pauses or stops the execution of the current thread for some specified period. It doesn’t release the lock while waiting and is mostly used to introduce pause on execution. It is defined in thread class, and no need to call from a synchronized context.  
				
				Example:  
				
				synchronized(monitor) 
				{ 
				Thread.sleep(1000);     Here Lock Is Held by The Current Thread 
				//after 1000 milliseconds, the current thread will wake up, or after we call that is interrupt() method 
				} 
		
 Ques 5. What’s the difference between notify() and notifyAll()?
 Ans 5. notify()  : It sends a notification and wakes up only a single thread instead of multiple threads that are waiting on the object’s monitor.
 		notifyAll() : It sends notifications and wakes up all threads and allows them to compete for the object's monitor instead of a single thread. 
 		
 Ques 6. Why wait(), notify(), and notifyAll() methods are present in Object class?
 Ans 6.  We know that every object has a monitor that allows the thread to hold a lock on the object. But the thread class doesn't contain any monitors. Thread usually waits for the object’s monitor (lock) by calling the wait() method on an object, and notify other threads that are waiting for the same lock using notify() or notifyAll() method.  Therefore, these three methods are called on objects only and allow all threads to communicate with each that are created on that object
	
 Ques 7. What is Runnable and Callable Interface? Write the difference between them.
 Ans 7. Both the interfaces are generally used to encapsulate tasks that are needed to be executed by another thread. But there are some differences between them as given below: 
 
	    Running Interface : This interface is basically available in Java right from the beginning. It is simply used to execute code on a concurrent thread.
	   
	    Callable Interface : This interface is basically a new one that was introduced as a part of the concurrency package. It addresses the limitation of runnable interfaces along with some major changes like generics, enum, static imports, variable argument method, etc. It uses generics to define the return type of object.
	    
	    		public interface Runnable  
	    		{   
	    		  public abstract void run(); 
	    		}  
 
	    		public interface Callable<V>  
	    		{    
	    		  V call() throws Exception;  
	    		} 
	    		
 Ques 8. What is synchronized method and synchronized block? Which one should be preferred?	    
 Ans 8. Synchronized Method : In this method, the thread acquires a lock on the object when they enter the synchronized method and releases the lock either normally or by throwing an exception when they leave the method.  No other thread can use the whole method unless and until the current thread finishes its execution and release the lock. It can be used when one wants to lock on the entire functionality of a particular method. 

 		Synchronized Block : In this method, the thread acquires a lock on the object between parentheses after the synchronized keyword, and releases the lock when they leave the block. No other thread can acquire a lock on the locked object unless and until the synchronized block exists. It can be used when one wants to keep other parts of the programs accessible to other threads.
 
 		Synchronized blocks should be preferred more as it boosts the performance of a particular program. It only locks a certain part of the program (critical section) rather than the entire method and therefore leads to less contention		 
	
 Ques 9. Can you start a thread twice?
 Ans 9.  No, it's not at all possible to restart a thread once a thread gets started and completes its execution. Thread only runs once and if you try to run it for a second time, then it will throw a runtime exception i.e., java.lang.IllegalThreadStateException.
 		Example: 
				 public class TestThreadTwice1 extends Thread
				 {   
					 public void run()
					 {   
						 System.out.println(" thread is executing now........");   
					 }   
					 	public static void main(String args[])
					 {   
						 TestThreadTwice1 t1=new TestThreadTwice1();   
						 t1.start();   
						 t1.start();   
					 }   
				 }   
 
				 Output:
			
				 thread is executing now........ 
				 Exception in thread "main" java.lang.IllegalThreadStateException	
				 
Ques 10. What is a shutdown hook ?
Ans 10. A shutdown hook is simply a thread that is invoked implicitly before JVM shuts down. It is one of the most important features of JVM because it provides the capacity to do resource cleanup or save application state JVM shuts down.  By calling the halt(int) method of the Runtime class, the shutdown hook can be stopped. Using the following method, one can add a shutdown hook. 

		public void addShutdownHook(Thread hook){}     
		Runtime r=Runtime.getRuntime();   
		r.addShutdownHook(new MyThread());
			 		

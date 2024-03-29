 Ques 1. Which of the following statements will throw an exception?
		 a. System.out.println(1/0);
 		 b. System.out.println(2.0/0);
 Ans: a  will throw an exception named ArithmeticException. The second statement will give output infinity.
 
 Ques 2. Which exception may be thrown if the given code is executed?
		 public class Test 
		 {
		 public static void main(String[] args) 
		 {
		  try {
		    int[ ] list = new int[10];
		    System.out.println("list[10] is " + list[10]);
		  }
		  catch (ArithmeticException ex) {
		     System.out.println("ArithmeticException");
		  }
		  catch (ArrayIndexOutOfBoundsException ai) {
		     System.out.println("ArrayIndexOutOfBoundsException");
		   }
		  catch (RuntimeException ex) {
		     System.out.println("RuntimeException");
		    }
		   }
		 }
 Ans 2. ArrayIndexOutOfBoundsException because user printing the 10 position but in array its store array 0 to 9 only.
 
 Ques 3. Which is the Parent Class of Error class or Exception Class.
 Ans 3.   Object_Class  -> Throwable_Class -> 1.Error_Class
 					      2.Exception_Class

 Ques 4. Write all the Checked Exception or Unchecked Exception.
 Ans 4. Checked exceptions are those exceptions that are checked by Java compiler at compilation. A list of some important checked exceptions are given below:
	 	1.ClassNotFoundException
	 	2.InterruptedException
	 	3.InstantiationException
	 	4.IOException
	 	5.SQLException
	 	6.IllegalAccessException
	 	7.FileNotFoundException
	 	
	 	Runtime exceptions are those exceptions that are checked by JVM at runtime. Some important examples of runtime exceptions are given below:
		1.ArithmeticException
	 	2.ClassCastException
	 	3.NullPointerException
	 	4.ArrayIndexOutOfBoundsException
	 	5.NegativeArraySizeException
	 	6.ArrayStoreException
	 	7.IllegalThreadStateException
	 	8.SecurityException
	 	
Ques 5. What will happen to exception object after exception handling is done?
Ans 5. Once exception handling is done, the exception object will be garbage collected.

Ques 6. Can we throw checked exceptions from the static block?
Ans  6. We cannot throw because there is no specific place to catch it and it is called only once.


Ques 7. Can we create a finally block without creating a catch block?
Ans  7. Yes we can make it.

Ques 8. Does a finally block override the value returned by try or catch block?
Ans  8. Yes we can override it.

Ques 9.Can we throw multiple exceptions in one throw statement?
Ans  9.No, we cannot throw multiple exceptions in one throw statement. Only one object of exception type can be thrown by using throw statement at a time.

Ques 10.What are the three possible forms of try block?
Ans 10.There are three possible forms of try block that are:
		try-catch
		try-finally
		try-catch-finally


	 	
 											  
 			  
 			  

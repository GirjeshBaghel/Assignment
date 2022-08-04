package Revision;

public class Reverse_No  extends FIbonacci_Series{
	
	// run method
	public void run() { 
		try{
			sleep(10000); // sleeping run method for 10 sec
		}catch(Exception e)
		{
			System.out.println(e);
		}
			
		System.out.print("Enter the 10 Values here : "); // taking a 10 values from user
		for(i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt(); // taking value from user in to loop form
		}
		 for(i=0; i<arr.length; i++) // checking the value 
	        {
	            for(j=i+1; j<arr.length; j++) // which value is greater than 
	            {
	                if(arr[i]<arr[j]) // checking greater value here
	                {
	                   temp = arr[i]; // interchange the value
	                   arr[i] = arr[j];
	                   arr[j] = temp; 
	                }
	            }
	        }
	        
	        // breaking the line
	        System.out.println();
	        for (int i = 0; i < arr.length; i++) // printing the values from decrement order 
	         {   
	        	 System.out.print(arr[i] + " ");
	        		                
	         }  
	}

}

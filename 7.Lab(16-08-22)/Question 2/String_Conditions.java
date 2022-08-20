/*Write a program to do the following process 
	-Number of Duplicate Words in String 
	-Number of Words in Given String
	-Occurrences of Each Character in String
	-Remove Duplicate Words from String -Count of Vowels*/
package String;
import java.util.Scanner;

public class String_Conditions {
	Scanner sc = new Scanner(System.in);					// global varaible declaration here
	String st,temp,result="";
	int count=0,i,j,count_words=0,len,count_wor=0,vol=0;

	
	void condition()							// condition method
	{
		System.out.print("Enter a Long String here : ");		// taking a string from user
		st = sc.nextLine();	
		if(st != null && !st.isEmpty())					// checking if string is not null
		{
			char_dup();						// calls a char_dup method
			words_count();						// calls a words_count method
			dup_words();						// calls a dup_words method
			rem_dup();						// calls a remove_dupwords method
			vowel_count();						// calls a vowel counts method
			occurance();						// calls a occurance method
			
		}
		
	}
	void char_dup()								// chararacter duplicate method
	{
		char str[] = st.toCharArray();					// convert a string into a array
		
		for(i=0; i<st.length(); i++)
		{ 
			for(j=i+1; j<st.length(); j++)
			{
				
				if(str[i] == str[j] && str[i] != ' ')		// if in a string contains duplliate character 
				{
					System.out.print(str[j]+" ");		// printing the duplicate characteres
					count++;
					break;										
				}
			}
		}
		System.out.println("\nNo of Duplicate Alphabets are : "+count); // printing the no of duplicate chracters here
		
		
	}
	 void dup_words()							// duplicate words method
	{
		 st = st.toLowerCase();						// convert a whole string in a lower case
		 String words[] = st.split(" ");    				// after space string will be split and stored in a words array
         
		 System.out.println("Duplicate words in a  string : ");    	// print the line only here
	        for(int i = 0; i < words.length; i++) 
	        {    
	            count_wor = 1;    
	            for(int j = i+1; j < words.length; j++) 			// loops for running the words length		
	            {    	
	                if(words[i].equals(words[j])) 				// checking the words are same in a string or not
	                {    
	                    count_wor++;   	                     		// if same then counting the no of words are same here
	                    words[j] = "remove";    					
	                }
	                
	            }
	            if(count_wor > 1 && words[i] != "remove")   		// checking a words[i] != 0 then priting the 
	            {
	            	System.out.println(words[i]+" ---> "+count_wor);	// printing the duplicate words and no of words are duplicate 
	            }
	                   
	        }
			
	}
	
	
	void rem_dup()								// remove duplicate words from a string here
	{
		st = st.toLowerCase();						// convert a whole string in a lower case
		 String rem[] = st.split(" ");    				// after a split from the space then its stored in a rem array
        	
		for(int i = 0; i < rem.length; i++) 				// for loop for running a process
	        {    	
	            count_wor = 1;    
	            for(int j = i+1; j < rem.length; j++) 
	            {    
	                if(rem[i].equals(rem[j])) 				// compare the string here
	                {    
	                	rem[j]="remove";					// if same words contains then stored that word in a rem[j]
	                  
	                }
	             }
	            	                   
	        }
	        for(String word: rem) 						// foreach loop for stored a rem into a word
	        {
				if(word != "remove") 				
				{
					result = result + word + " ";		// storing a single type string here only
				}
			}
	        System.out.println("\nSentence after removing duplicate words: " + result); // removing a duplicate string here

	}
	
	void words_count()							// counting the words in a string
	{ 
		
		char ch[] = new char[st.length()];				//convert a string length into a ch array
		for(i=0; i<st.length(); i++)			
		{
			ch[i] = st.charAt(i);					
			 if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  // conditions for word count
                 count_words++;							// counting the words
			 
		}
		
		System.out.println("No of Words are : "+count_words);		// printing the no of words are here
		
	}
	void occurance()
	{
		System.out.println("Frequency of the Words are : ");		// printing that statement 
		int counter[] = new int[256];					// passing the size of array
				  
		for (i = 1; i < st.length(); i++)   				
		{  
			counter[(int) st.charAt(i)]++;  			// counting the no of frequency of each words
		}  
		  
		for (i = 1; i < 256; i++)   					// for loop running by the array size
		{  
			if (counter[i] != 0)   
			{  
		      
				System.out.println((char) i + " --> " + counter[i]);  	// printing the frequency of each alphabet here
			}	  
		}  
	}
	 void vowel_count()  							// vowel count method
	 {
		 st= st.toLowerCase();						// convert a string into a lower case
		
		 for(i=0; i<st.length(); i++)					// for running for string length
		 {
			 char vowel = st.charAt(i);				// convert a string into a char
			 if((vowel =='a') || (vowel =='e') || (vowel =='i') || (vowel =='o') || (vowel =='u')) // condition for no of vowel count
			 {
				 vol++;						// counting all the vowels heree
			 }
		 }
		 System.out.println("Total vowel are used  : "+vol);		// printing the vowels 
	 }

	public static void main(String[] args)					// main method
	{
		String_Conditions s = new String_Conditions();
		s.condition();							// calls a condition method
	}
}

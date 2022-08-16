/*Write a program to do the following process -Number of Duplicate Words in String -Number of Words in Given String-Occurrences of Each Character in String
-Remove Duplicate Words from String -Count of Vowels*/
package String;
import java.util.Scanner;

public class String_Conditions {
	

	Scanner sc = new Scanner(System.in);
	String st,temp,result="";
	int count=0,i,j,count_words=0,len,count_wor=0,vol=0;

	
	void condition()
	{
		System.out.print("Enter a Long String here : ");
		st = sc.nextLine();
		if(st != null && !st.isEmpty())
		{
			char_dup();
			words_count();
			dup_words();
			rem_dup();
			vowel_count();
			occurance();
			
		}
		
	}
	void char_dup()
	{
		char str[] = st.toCharArray();
		
		for(i=0; i<st.length(); i++)
		{ 
			for(j=i+1; j<st.length(); j++)
			{
				
				if(str[i] == str[j] && str[i] != ' ')
				{
					System.out.print(str[j]+" ");
					count++;
					break;										
				}
			}
		}
		System.out.println("\nNo of Duplicate Alphabets are : "+count);
		
		
	}
	 void dup_words()
	{
		 st = st.toLowerCase();
		 String words[] = st.split(" ");    
         
		 System.out.println("Duplicate words in a  string : ");    
	        for(int i = 0; i < words.length; i++) 
	        {    
	            count_wor = 1;    
	            for(int j = i+1; j < words.length; j++) 
	            {    
	                if(words[i].equals(words[j])) 
	                {    
	                    count_wor++;   	                     
	                    words[j] = "0";    
	                } 
	                
	            }
	            if(count_wor > 1 && words[i] != "0")   
	            {
	            	System.out.println(words[i]+" ---> "+count_wor);
	            }
	                   
	        }
			
	}
	
	
	void rem_dup()
	{
		st = st.toLowerCase();
		 String rem[] = st.split(" ");    
        
		     
	        for(int i = 0; i < rem.length; i++) 
	        {    
	            count_wor = 1;    
	            for(int j = i+1; j < rem.length; j++) 
	            {    
	                if(rem[i].equals(rem[j])) 
	                {    
	                	rem[j]="remove";
	                  
	                }
	             }
	            	                   
	        }
	        for(String word: rem) 
	        {
				if(word != "remove") 
				{
					result = result + word + " ";
				}
			}
	        System.out.println("\nSentence after removing duplicate words: " + result);

	}
	void words_count()
	{ 
		
		char ch[] = new char[st.length()];
		for(i=0; i<st.length(); i++)
		{
			ch[i] = st.charAt(i);
			 if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                 count_words++;
			 
		}
		
		System.out.println("No of Words are : "+count_words);
		
	}
	void occurance()
	{
		int counter[] = new int[256];
				  
		for (i = 1; i < st.length(); i++)   
		{  
			counter[(int) st.charAt(i)]++;  
		}  
		  
		for (i = 1; i < 256; i++)   
		{  
			if (counter[i] != 0)   
			{  
		      
				System.out.println((char) i + " --> " + counter[i]);  
			}	  
		}  
	}
	 void vowel_count()
	 {
		 st= st.toLowerCase();
		
		 for(i=0; i<st.length(); i++)
		 {
			 char vowel = st.charAt(i);
			 if((vowel =='a') || (vowel =='e') || (vowel =='i') || (vowel =='o') || (vowel =='u'))
			 {
				 vol++;
			 }
		 }
		 System.out.println("Total vowel are used  : "+vol);
	 }

	public static void main(String[] args)
	{
		String_Conditions s = new String_Conditions();
		s.condition();
	}
}

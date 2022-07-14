package Functions;
import java.util.*;
class Palidorm_No
{
    // palidorm function
    public static void palidorm()
    {
        Scanner sc = new Scanner(System.in);
       
       int n, r,sum=0,temp;    
       
       System.out.print("Please the no : ");
       n= sc.nextInt();
  
        temp=n;
        // checking no is greater than zero or not
        while(n>0)
        {    
            r = n%10;  
            sum = (sum*10)+r;    
            n = n/10;    
        }

        if(temp==sum)    
        System.out.println("Palindrome number :  "+sum);    
        else    
        System.out.println("Not palindrome : ");    
     }
    
    // main method
    public static void main(String[] args)
    {
        // palidorm function calling
        palidorm();
    }

}

//WAP to take a two no from user and do task for operators in separate funtions

import java.util.*;
class Operators
{
    // accept method that accepting the values from user and calling the other funtions
    public static void accept()
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Please Enter the two values : ");
        a = sc.nextInt();
        b = sc.nextInt();
        arth(a,b);
        relation(a,b);
        ternary(a,b);
        logical(a,b);
        assigment(a,b);

    }

    // arth method that take two parameters
    public static void arth(int x, int y)
    {
        System.out.println("Arthmetic Operators Output is ");
        System.out.println("Addition is :  "+(x+y));
        System.out.println("Subtraction is : "+(x-y));
        System.out.println("Multiplication is : "+(x*y));
        System.out.println("Division is : "+(x/y));
        System.out.println("Modulus : "+(x%y));

    }
    
    // relation method that taking two parameters
    public static void relation(int x, int y)
    {
        System.out.println("Your Relational Output is : ");
        if(x>y)
        {
            System.out.println("X is greater then y : "+x);

        }
        else
           System.out.println("y is greater then x :  "+y);
      
    }

    // ternery method that taking two parameters
    public static void ternary(int x, int y)
    {
         System.out.println("Your Ternary Output is   ");
         int res = (x>y)? x:y;
          System.out.println("Output is here : "+res);
    }

    // logical method that taking two parameters
    public static void logical(int a, int b)
    {
        System.out.println("Your Logical Output is here : ");
        System.out.println("AND : "+(a>b && b<a));
        System.out.println("OR : "+(a<b || b<a));
        System.out.println("NOT : "+(a>b | b>a));
    }

    // assigment method that taking two parameters
    public static void assigment(int x, int y)
    {
        System.out.println("Your Assigment Operator  Output is here : ");
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("The value of X : "+x);
        System.out.println("The value of Y : "+y);
    }
    
    // main method
    public static void main(String[] args)
    {
        // accept method calling
        accept();
    }
}

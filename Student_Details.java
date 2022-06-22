//WAP to accept the no of  Students Name, roll no, marks of 5 subject , calculate Percentage and display the grade
package Arrays;
import java.util.Scanner;
class Student_Details
{
 
 public static void accept()
 {
     Scanner sc = new Scanner(System.in);
     int no;
     System.out.print("Enter the no of student data to be stored : ");
     no = sc.nextInt();
     int roll[] = new int[no];
     int hindi[] = new int[5];
     int eng[] = new int[5];
     int math[] = new int[5];
     int sci[] = new int[5];
     int sst[] = new int[5];
     int total[] = new int[5];
     double per[]  = new double[5];
     char grade[] = new char[5];
     String name[]=new String[no];

     // taking no of data student to be find
     System.out.print("Enter the " +no+" Student details here....\n");
     for(int i=0; i<no; i++)
     {
         System.out.print("\nEnter Roll no : \n");
         roll[i] = sc.nextInt();

         System.out.print("Enter name : \n");
         name[i] = sc.nextLine();
         
         System.out.println("Enter the Marks of Student..");

         System.out.print("Hindi : ");
         hindi[i] = sc.nextInt();

         System.out.print("English : ");
         eng[i] = sc.nextInt();

         System.out.print("Maths : ");
         math[i] = sc.nextInt();

         System.out.print("Science : ");
         sci[i] = sc.nextInt();

         System.out.print("SST : ");
         sst[i] = sc.nextInt();

         // total marks
         total[i] = hindi[i]+eng[i]+math[i]+sci[i]+sst[i];

         System.out.print("Total Marks : "+total[i]);

         // percentage
         per[i] = total[i]/5.0;

         System.out.print("\nPercentage : "+per[i]);

         // grade
         if(per[i]>90)
         {
             grade[i] = 'A';

         }

         else if(per[i]>80)
         {
             grade[i] ='B';
         }
         else if(per[i]>70)
         {
             grade[i] ='C';
         }
         else if(per[i]>60)
         {
             grade[i] ='D';
         }

         else
         grade[i] = 'E';
         System.out.print("\nGrade : "+grade[i]);

     }

     // show total student data here
     System.out.println("\nFinal output of these student is......");
     for(int i=0; i<no; i++)
     {
         System.out.println("Roll no : "+roll[i]+"\tName : "+name[i]+"\tTotal Marks : "+total[i]+"\tPercentage : "+per[i]+"\tGrade : "+grade[i]);
     }


 }

 // main method
 public static void main(String[] args)
 {
     // accept method calling
     accept();    
 }
}


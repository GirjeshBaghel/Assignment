/*Write a Java program to implement following options on LinkedList using collections.
Intersection
Union
Display*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LinkedList_Conditions {
	 public <T> List<T> union(List<T> list1, List<T> list2)
     {
          Set<T> set = new HashSet<T>();
          set.addAll(list1);
          set.addAll(list2);
          return new LinkedList<T>(set);
     }
     public <T> List<T> intersection(List<T> list1, List<T> list2)
     {
          List<T> list = new LinkedList<T>();
          for (T t : list1)
          {
               if(list2.contains(t))
               {
                    list.add(t);
               }
          }
          return list;
     }
     public static void main(String... args) throws Exception
     {
          List<String> list1 = new LinkedList<String>(Arrays.asList("A", "B", "C"));
          List<String> list2 = new LinkedList<String>(Arrays.asList("B", "C", "D", "E", "F"));
          System.out.println("===========================");
          System.out.println("Intersection of LinkedList.");
          System.out.println(new LinkedList_Conditions().intersection(list1, list2));
          System.out.println("=========================\n");
          System.out.println("Union of LinkedList.");
          System.out.println(new LinkedList_Conditions().union(list1, list2));
          System.out.println("========================\n");
     }


}

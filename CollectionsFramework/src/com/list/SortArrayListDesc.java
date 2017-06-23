package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayListDesc {

    public static void main(String[] args) {

           //create an ArrayList object
           ArrayList<Integer> arrayList = new ArrayList<Integer>();

           //Add elements to Arraylist
           arrayList.add(11);
           arrayList.add(2);
           arrayList.add(3);
          arrayList.add(45);
           arrayList.add(5);
           arrayList.add(62);
           
//           Collections.sort(arrayList);
//           System.out.println(arrayList);

         

        Collections.sort(arrayList);
         System.out.println("Before sorting  : "  + arrayList);
         /*
         Use static Comparator reverseOrder() method of Collections 
      utility class to get comparator object
         */

       Comparator comparator = Collections.reverseOrder();
       int[] arr ={111,211,3333,44};
          /*
             use
             static void sort(List list, Comparator com) method of Collections class.
           */

           Collections.sort(arrayList,comparator);
           System.out.println("After sorting  : "+ arrayList);

      }
   }
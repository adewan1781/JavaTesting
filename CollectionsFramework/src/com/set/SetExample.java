package com.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String args[]){  
		  //Creating HashSet and adding elements  
		  Set<String> set=new HashSet<String>();  
		  set.add("Ravi");  
		  set.add("Vijay");  
		  set.add("vijay");
		  set.add("raj");
		  boolean flag = set.add("Ravi");
		  System.out.println(flag);
		  set.add("Ajay");  
		  //Traversing elements  
		  Iterator<String> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }
		  System.out.println();
//		  Collection<String> c = set;
		  List<String> ll = new ArrayList<String>(set);
		  Collections.sort(ll);
		  System.out.println(ll);
		  System.out.println();
		  
		  TreeSet<Object> al1=new TreeSet<Object>(set); 
		  System.out.println(al1);
//		  for(Object obj1 : al1){
//			  System.out.println(obj1);
//		  }
		  
		  
		  TreeSet<Object> al=new TreeSet<Object>(); 
//		  al.add("Ravi");  
//		  al.add("Vijay");  
//		  al.add("Ravi");  
//		  al.add("Ajay");  
		  al.add(12);
		  al.add(124);
		  al.add(123);
		  al.add(125);
		  System.out.println(al);
		  
		  Set<Book> set1=new TreeSet<Book>();  
		    //Creating Books  
		    Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);  
		    Book b2=new Book(233,"Operating System","Galvin","Wiley",6);  
		    Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
		    //Adding Books to TreeSet  
		    set1.add(b1);  
		    set1.add(b2);  
		    set1.add(b3);  
		    //Traversing TreeSet  
		    for(Book b:set1){  
		    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
		    }  
		 }  
}

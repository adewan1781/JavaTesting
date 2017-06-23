package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AllLists {

	public static void main(String[] args) {
		int x=5;
		long ll = 9000;
		

		Integer intClass = new Integer(100);
		Byte bb = new Byte((byte) 23);
		Long longObj = new Long(900);
		
		List<Object> mmm = new MyList();
		mmm.add("refaque@gmail.com");
		mmm.add("amit@");
		boolean ff = mmm.add("sunil");
		System.out.println(ff);
		System.out.println(((MyList) mmm).getList());
		
		List<Object> listStrings = new ArrayList<Object>(100);
		listStrings.add("One");
		listStrings.add("One");
		listStrings.add("One");
		listStrings.add("One");
		
		listStrings.add("Two");
		listStrings.add("Three");
		listStrings.add(1,"Four");
		listStrings.add(new Integer(8));
		listStrings.add(null);
		 System.out.println(listStrings.get(5));
		System.out.println(listStrings);
		
		Iterator<Object> itr = listStrings.iterator();
		
		for(int i = 0;itr.hasNext();i++){
			Object obj = itr.next();
			System.out.println(obj);
			int in = listStrings.lastIndexOf(obj);
			System.out.println(i);
		}
		
		
		List<String> listStrings2 = new LinkedList<String>();
		listStrings2.add("Five");
		listStrings2.add("Six");
		listStrings2.add(0,"Seven");
		listStrings2.add("Eight");
		 
		listStrings2.get(0);
		((LinkedList<String>) listStrings2).getFirst();
		
		System.out.println(listStrings2);
		List<Object> listAnything = new ArrayList<Object>();
		
		List<String> listWords = new ArrayList<String>();
		List<Integer> listNumbers = new ArrayList<Integer>(10);
		listNumbers.add(7);
		listNumbers.add(new Integer(3));
//		listNumbers.get(0)
	
		
		List<String> linkedWords = new LinkedList<String>();
		
		List<Integer> listNumbers2 = new ArrayList<>(1000);
		
		// But this will cause compile error----------------------------    listStrings.add(123);
		
		List<Number> linkedNumbers = new LinkedList<>();
		 linkedNumbers.addAll(listNumbers);
		linkedNumbers.add(new Integer(123));
		linkedNumbers.add(new Float(3.1415));
		linkedNumbers.add(new Double(299.988));
		linkedNumbers.add(new Long(67000));
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(new Integer(10));
		numbers.add(5);
		numbers.add(4);
		numbers.add(7);
		
		Collections.sort(numbers);
		System.out.println(numbers);
		
		System.out.println(Double.valueOf("700"));
	}

}

package com.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort3 {
	public static void main(String args[]) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(15);
		arr.add(27);
		arr.add(10);
		arr.add(5);
		arr.add(2);
		
		Collections.sort(al);
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
			int index = al.indexOf(st);
			
			for(Integer obj:arr){
				if(obj.intValue()>st.rollno)
					System.out.println(obj+" is greater than roll no at index "+index+"("+st.rollno+")");
				else if(obj.intValue()<st.rollno)
					System.out.println(obj+" is less than roll no at index "+index+"("+st.rollno+")");
				else if(obj.intValue()==st.rollno)
					System.out.println(obj+" is equal to roll no at index "+index+"("+st.rollno+")");
			}
		}
		
		
		
		
		
	}
}
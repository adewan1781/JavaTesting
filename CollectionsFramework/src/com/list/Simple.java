package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Simple {
	public static void main(String args[]) {
 
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		System.out.println("Sorting by Name...");
		Comparator<Student> cc = new NameComparator();
		Collections.sort(al, cc);
		

		//Collections.sort(al, new NameComparator());
		Iterator<Student> itr = al.iterator();
		while (itr.hasNext()) {
			Student st =  itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		itr = null;
		System.out.println("sorting by age...");

		Collections.sort(al, new AgeComparator());
		itr = al.iterator();
		while (itr.hasNext()) {
			Student st =  itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		
		for(Student st : al){
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}
}

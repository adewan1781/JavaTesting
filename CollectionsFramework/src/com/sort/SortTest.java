package com.sort;

import java.util.ArrayList;
import java.util.Collections;

public class SortTest {

	public static void main(String[] args) {
		//sorting object array
		ArrayList<Employee> empArr = new ArrayList<Employee>();
		empArr.add( new Employee(10, "Mikey", 25, 10000));
		empArr.add( new Employee(20, "Arun", 29, 20000));
		empArr.add( new Employee(5, "Lisa", 35, 5000));
		empArr.add( new Employee(1, "Pankaj", 32, 50000));

		//sorting employees array using Comparable interface implementation
//		Collections.sort(empArr);
		System.out.println("Default Sorting of Employees list:\n"+empArr);
		
		for(Employee obj1 : empArr){
			System.out.println(obj1.getId()+" "+obj1.getName());
		}
	}

}

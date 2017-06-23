package com.sort;

//Java provides Comparable interface which should be implemented
//by any custom class if we want to use Arrays or Collections sorting methods. 
//Comparable interface has compareTo(T obj) method which is used by sorting methods, 
//you can check any Wrapper, String or Date class to confirm this. We should override 
//this method in such a way that it returns a negative integer, zero, or a positive integer 
//if “this” object is less than, equal to, or greater than the object passed as argument.

public class Employee implements Comparable<Employee> {

    private int id;
    private String name;
    private int age;
    private long salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee emp) {
        //let's sort the employee based on id in ascending order
        //returns a negative integer, zero, or a positive integer as this employee id
        //is less than, equal to, or greater than the specified object.
        return (this.id - emp.id);
    }

    @Override
    //this is required to print the user friendly information about the Employee
    public String toString() {

    	String abc = "[id="+id;
        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
                this.salary + "]";
    }

}
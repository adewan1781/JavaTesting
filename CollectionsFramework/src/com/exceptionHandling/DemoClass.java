package com.exceptionHandling;

import java.io.File;

import com.list.Student;

public class DemoClass {

	static Student st;
	public static void main(String[] args) {
		File ff = new File("abcde.txt");
		
		boolean flag = ff.isFile();
		System.out.println(flag);
		System.out.println(ff.getAbsolutePath());
		try{
		int ds = 90/0;
		
//		}catch(ArithmeticException e){
//			System.out.println(e.getClass()+" "+e.getMessage());
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
		}catch(Throwable e){
			System.out.println("aaaaaaaaaaaaaaaa "+e.getMessage());
		}
		try{
			throw new RuntimeException("I am throwing exception deliberately");
		}catch(Throwable e){
			System.out.println(e.getMessage());
		}
		try{
		st.getClass();
		}catch(RuntimeException e){
			System.out.println(e.getClass()+" "+e.getMessage());
		}finally{
			System.out.println("sssssss");
		}
	}
}

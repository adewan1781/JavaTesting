package com.set;

import java.util.*;  
class Book implements Comparable<Book>{  
	int id;  
	String name,author,publisher;  
	int quantity;  
	public Book(int id, String name, String author, String publisher, int quantity) {  
		this.id = id;  
		this.name = name;  
		this.author = author;  
		this.publisher = publisher;  
		this.quantity = quantity;  
	}
	@Override
	public int compareTo(Book b) {
//		return author.compareTo(b.author);
		if(author.compareTo(b.author)>0){  
		return 1;  
	}else if(author.compareTo(b.author)<0){  
		return -1;  
	}else{  
		return 0;  
	} 
	}  
	
		
 
//		return 0;

} 

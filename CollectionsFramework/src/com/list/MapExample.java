package com.list;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {  
	    Map<Integer,String> map=new HashMap<Integer,String>();  
	    //Adding elements to map  
	    map.put(1,"Amit");  
	    map.put(5,"Rahul");  
	    map.put(2,"Jai");  
	    map.put(6,"Amit"); 
	    
	    Set<Integer> keyset = map.keySet();
	    
	    for(Integer in: keyset){
	    	System.out.println(in+" "+map.get(in));
	    }
	    
//	    System.out.println(map);
	}
}

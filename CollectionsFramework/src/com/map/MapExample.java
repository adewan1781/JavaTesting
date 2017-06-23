package com.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	
	Map<Integer,String> mapObj = new HashMap<Integer,String>();
	
	public static void main(String[] args) {
		Map<Integer,String> mapObj = new HashMap<Integer,String>();
		mapObj.put(100, "amit");
		mapObj.put(101,"Vijay");  
		mapObj.put(102,"Rahul");  
		mapObj.put(500,"Vijay");  
		mapObj.put(99,"Rahul");
		mapObj.put(99,"sumit");
		mapObj.put(null,"Rahul1");
		mapObj.put(null,"Rahul2");
		mapObj.put(9933,null);
		mapObj.put(993,null);
		mapObj.get(101);
		Set<Integer> ks = mapObj.keySet();
		
		for(Integer object : ks){
			System.out.println(object+" "+mapObj.get(object));
		}
		System.out.println();
		Set<Map.Entry<Integer,String>> entrySet = mapObj.entrySet();
		
		for(Map.Entry<Integer,String> sampleEntry: entrySet){
			System.out.println(sampleEntry.getKey()+" "+sampleEntry.getValue());
		}
		System.out.println();
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(101,"Vijay");  
		  hm.put(102,"Rahul");  
		  hm.put(102,"Rahul1");  
		  hm.put(1021,"Rahul2");  
		  hm.put(1022,"Rahul3"); 
		  
		  
		  Set<Integer> ks1 = hm.keySet();
			
			for(Integer object : ks1){
				System.out.println(object+" "+hm.get(object));
			}
	}

}

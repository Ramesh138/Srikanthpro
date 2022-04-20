package com.arrays.practice;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Hashmappg1 {
	
	public static void main(String[] args) {
		
		
		 
		        // Creating object for Map.
		        Map<Integer, String> map
		            = new HashMap<Integer, String>();
		 
		        // Adding Elements using Map.
		        map.put(100, "Amit");
		        map.put(101, "Vijay");
		        map.put(102, "Rahul");
		        
		 System.out.println(map);
		        // Elements can traverse in any order
		        for (Map.Entry m : map.entrySet()) {
		            System.out.println(m.getKey() + " "
		                               + m.getValue());
		        }
		        
		       
		        
		        
		        
		        
		        
		        Hashtable<Integer, String> ht1 = new Hashtable<>();
		        
		        // Initialization of a Hashtable
		        // using Generics
		        Hashtable<Integer, String> ht2  = new Hashtable<Integer, String>();
		  
		        // Inserting the Elements
		        // using put() method
		        ht1.put(1, "one");
		        ht1.put(2, "two");
		        ht1.put(3, "three");
		  
		        ht2.put(4, "four");
		        ht2.put(5, "five");
		        ht2.put(6, "six");
		        
		        
		  
		        // Print mappings to the console
		        System.out.println("Mappings of ht1 : " + ht1);
		        System.out.println("Mappings of ht2 : " + ht2);
		    }
	

}

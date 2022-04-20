package com.arrays.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Listpg1 {
	
	public static void main(String[] args) {
		
		List<String> li= new ArrayList<>();
		
		li.add("ramesh");
		li.add("mahesh");
		li.add("ramesh");
		li.add("srikanth");
		li.add(null);
		
		
		System.out.println(li);
		
		System.out.println(li);
		System.out.println(li.contains("ramesh"));
		System.out.println(li.get(4));
		//System.out.println(li.remove("ramesh"));
		
		
		
		
		String value[]= {"rame","sam"};
		
		
		
		  LinkedList<String> cars = new LinkedList<>();
	        cars.add("Volvo");
	        cars.add("BMW");
	        cars.add("Ford");
	        cars.add("Mazda");
	        cars.add("Volvo");
	        cars.add("BMW");
	        cars.add("Ford");
	        cars.add("Mazda");
	        cars.add(null);
	     System.out.println(cars);
	     
	     System.out.println(cars.getFirst());
	}

}

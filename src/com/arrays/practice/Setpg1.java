package com.arrays.practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Setpg1 {
	
	public static void main(String[] args) {
	    Set<String> hashSet = new HashSet<>();
        hashSet.add("Osman");
        hashSet.add("Nurkut");
        hashSet.add("Ayse");
        hashSet.add("Osman");
        
        for (String str : hashSet) {
            System.out.println("HashSet: " + str);
        }
        
        System.out.println(hashSet);

        System.out.println("\n");
        
        
        Set<String> li=new LinkedHashSet<>();
        
        li.add("Rame");
        li.add("Rames");
        li.add("Rame");
        
        System.out.println(li);
        
        
        
        
	}

}

package com.arrays.practice;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArraylistVsLinklist {
	
	 // Main driver method
    public static void main1(String[] args)
    {
        // Creating an ArrayList of Integer type
        ArrayList<Integer> arrli
            = new ArrayList<Integer>();
 
        // Appending the new elements
        // at the end of the list
        // using add () method via for loops
        for (int i = 1; i <= 5; i++)
            arrli.add(i);
 
        // Printing the ArrayList
        System.out.println(arrli);
 
        // Removing an element at index 3
        // from the ArrayList
        // using remove() method
        arrli.remove(3);
 
        // Printing the ArrayList after
        // removing the element
        System.out.println(arrli);
    }
    
    
 // main driver method
    public static void main2(String args[])
    {
 
        // Creating an object of the
        // class linked list
        LinkedList<String> object
            = new LinkedList<String>();
 
        // Adding the elements to the object created
        // using add() and addLast() method
 
        // Custom input elements
        object.add("A");
        object.add("B");
        object.addLast("C");
 
        // Print the current LinkedList
        System.out.println(object);
 
        // Removing elements from the List object
        // using remove() and removeFirst() method
        object.remove("B");
        object.removeFirst();
 
        System.out.println("Linked list after "
                           + "deletion: " + object);
    }

}

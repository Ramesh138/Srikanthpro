package com.arrays.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Collectionss {
   public static void main(String[] args) {
      // List
      List list = new ArrayList();
      list.add("HCL");
      list.add("DELL");
      list.add("Avi");
      list.add("Ramesh");
      list.add("Sri");
      // Sorting List in ascending order according to the natural ordering
      Collections.sort(list);
      
      System.out.println(list);
}
}
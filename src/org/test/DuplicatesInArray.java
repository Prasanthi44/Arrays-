package org.test;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesInArray {
	public static void main(String[] args) {
 	  List<Integer> e=new ArrayList<Integer>();
 	  e.add(10);
 	  e.add(10);
 	  e.add(20);
 	  e.add(50);
 	  e.add(60);
 	  e.add(80);
 	  e.add(60);
 	  e.add(50);
 	   int i=e.size();
 	  System.out.println(i);
 	  e.remove(0);
 	  e.remove(6);
 	  e.remove(5);
 	  System.out.println(e);
		
		
	}
	
	
	
	

}

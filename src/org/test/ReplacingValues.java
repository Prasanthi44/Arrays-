package org.test;

import java.util.ArrayList;
import java.util.List;

public class ReplacingValues {
	public static void main(String[] args) {
		List<Integer>n=new ArrayList<Integer>();
	    n.add(10);
	    n.add(20);
	    n.add(30);
	    n.add(90);
	    n.add(10);
	    n.add(10);
	    n.add(40);
	    n.add(50);
	    n.add(10);
	    System.out.println(n);
	  n.set(2,50);  
	  System.out.println(n);
	  n.set(7, 70);
	  n.add(100);
	  System.out.println(n);
	  List<Integer>p=new ArrayList<Integer>();
	   p.add(100);  
	   p.add(200);
	   p.add(300);
	   p.add(400);
	   p.add(500);
	   p.add(600);
	   p.add(700);
	   p.set(2, 350);
	  System.out.println(p);
	  
	  
	    
	}

}

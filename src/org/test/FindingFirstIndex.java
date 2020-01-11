package org.test;

import java.util.ArrayList;
import java.util.List;

public class FindingFirstIndex {
	public static void main(String[] args) {
		List<Integer> p=new ArrayList<Integer>();
		p.add(10);
		p.add(20);
		p.add(30);
		p.add(90);
		p.add(10);		
		p.add(10);
		p.add(40);		
		p.add(50);
		System.out.println(p);		
		p.remove(1);
		
		System.out.println(p);
		int d=p.indexOf(10);
		System.out.println(d);
		
		int c=p.indexOf(50);
		System.out.println(c);
		
		int e=p.indexOf(90);
		System.out.println(e);
		
		int s=p.indexOf(40);
		System.out.println(s);
		
		Integer i=p.get(0);
		System.out.println(i);
		
		
	}
	

}

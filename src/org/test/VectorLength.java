package org.test;

import java.util.List;
import java.util.Vector;

public class VectorLength {
	
	public static void main(String[] args) {
		List<Integer>e=new Vector<Integer>();
		   e.add(105);
		   e.add(205);
		   e.add(305);
		   e.add(405);
		   e.add(505);
		   e.add(605);
		   e.add(805);
		   e.add(705);
		   System.out.println(e);
		int i=e.size();
		System.out.println(i);
		System.out.println(e.get(2));
		
	}

}

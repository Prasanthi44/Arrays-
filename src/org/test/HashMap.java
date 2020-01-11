package org.test;

import java.util.*;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap {
	public static void main(String[] args) {
		Map<Integer,String>p=new LinkedHashMap<>();
		p.put(10, "Java");
		p.put(20, "Sql");
		p.put(30, "Oops");
		p.put(40, "Sql");
		p.put(50, "Oracle");
		p.put(60, "DB");
		p.put(10, "Selenium");
		p.put(50, "Psql");
		p.put(40, "Hadoop");
		System.out.println(p);
		
		Set<Integer>k=p.keySet();
		System.out.println(k);
		
		Collection<String>v=p.values();
		System.out.println(v);
		
		
		
	
	}
	
	

}

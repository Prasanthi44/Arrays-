package org.test;

public class Sample{
	public static void main(String[] args){
		System.out.println(0);
	
	try {
		int x=0;
		int y=5;
		int z=y/x;
		
	}catch(NullPointerException e) {
		System.out.println("Exception");
	}catch(ArithmeticException ae) {
		System.out.println("ArithmeticException");
	}
	finally{
		System.out.println("Success");
	}
	}

}
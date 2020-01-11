package org.test;

public class VarTest {
	static int count=100;
	private void increment() {
		count++;
			}
public static void main(String[] args) {
	VarTest obj1=new VarTest();
	VarTest obj2=new VarTest();
	obj1.increment();
	System.out.println("obj1:count is"+obj1.count);
	obj2.increment();
	System.out.println("obj1:count is"+obj2.count);
	System.out.println("obj1:count is"+obj1.count);
	System.out.println("obj2:count is"+obj2.count);
	}

}

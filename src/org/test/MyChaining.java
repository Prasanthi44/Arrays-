package org.test;

public class MyChaining {
public MyChaining() {
	System.out.println("In default constructor");
}
public MyChaining(int i) {
	this();
	System.out.println("In single constructor....");
}	
public MyChaining(int i,int j) {
	this(j);
	System.out.println("In double parameter construtor");
}	
public static void main(String[] args) {
MyChaining m=new MyChaining(10,30);
	
	
}
}

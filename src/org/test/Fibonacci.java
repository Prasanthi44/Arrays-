package org.test;

public class Fibonacci {
public static void main(String[] args) {
int a=0,b=1,c,count=30;
System.out.println(a+" "+b);
for (int i = 1; i < count; i++) {
	c=a+b;
	a=b;
	b=c;
	System.out.println(c+" ");
}	
	
	
	
}

}

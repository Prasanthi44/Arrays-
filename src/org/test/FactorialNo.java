package org.test;

import java.util.Scanner;

public class FactorialNo {
public static void main(String[] args) {
int i,fact=1;
Scanner reader=new Scanner(System.in);
int a=reader.nextInt();
System.out.println("Enter no "+a);
for (int j = 1; j <a; j++) {
	fact=fact*j;
}	
System.out.println("Factorial no of "+fact);	
	
		
	}

}

package org.test;

public class SumOfArrays {
	public static void main(String[] args) {
		int a[]=new int[10];
		float average;
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		a[5]=6;
		a[6]=7;
		a[7]=8;
		a[8]=9;
		a[9]=10;
	int sum=a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7]+a[8]+a[9];
		System.out.println("Total marks is "+sum);
		average=(float)sum/10;
		System.out.println("Average is "+average);
		int d=a.length;
		System.out.println(d);
		for(int b:a) {
			System.out.println(b);
         System.out.println("Iterate using normal");
         for(int i=0;i<a.length;i++) {
        	 System.out.println(a[i]);
         }
		
		
		}
		
		
	}
	

}

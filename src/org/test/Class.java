package org.test;
 import java.util.Arrays;
 import java.util.Scanner;
import java.lang.reflect.Array;

public class Class {
	
	public static void main(String[] args) {
		
		int temp;
		Scanner s=new Scanner(System.in);
		System.out.println("enter n:");
		int n=s.nextInt();
		
		int[] arr= new int[n];
		System.out.println("enter elements in array:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int j=0;j<arr.length;j++)
		{
			for(int k=0;k<arr.length-1;k++)
			{
				if(arr[k]>arr[k+1])
				{
				temp=arr[k];
				arr[k]=arr[k+1];
				arr[k+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.println(""+arr[i] +arr[i]);
		}
		
	}

}

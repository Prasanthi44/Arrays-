package org.test;

public class OddNoSum {
public static void main(String[] args) {
int sum=0;
for (int j = 0; j <25; j++) {
if (j%2==1) {
	sum=sum+j;
	
}	
}	
System.out.println("Odd number sum "+sum);
	}

}

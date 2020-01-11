package org.test;

public class AllCount {
public static void main(String[] args) {
	String s="Welcome To Java Class@123";
int smallcount=0,capscount=0,numbercount=0,splcount=0;
for (int i = 0; i < s.length(); i++) {
char ch=s.charAt(i);
if (ch>='a' && ch<='z') {
	smallcount++;
}
else if (ch>='A' && ch<='Z') {
	capscount++;
	}
else if (ch>='0' && ch<='9') {
	numbercount++;
}
else 
   splcount++;
}	

System.out.println("smallcount "+smallcount);
System.out.println("capscount "+capscount);	
System.out.println("numbercount "+numbercount);
System.out.println("splcount "+splcount);


}
}
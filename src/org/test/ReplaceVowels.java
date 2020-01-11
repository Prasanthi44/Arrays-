package org.test;

public class ReplaceVowels {
public static void main(String[] args) {
	String s="Welcome";
	char ch[]=s.toCharArray();
for (int i = 0; i < s.length(); i++) {
 if (ch[i]=='a' || ch[i]=='e'||ch[i]=='i' ||ch[i]=='o' || ch[i]=='u') {
	ch[i]='@';
	}
 System.out.println(ch[i]);
}
 
//for (int i = 0; i < s.length(); i++) {
//	System.out.println(ch[i]);
//}
}	
}
	
	
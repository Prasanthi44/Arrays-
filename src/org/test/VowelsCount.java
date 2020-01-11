package org.test;

public class VowelsCount {
public static void main(String[] args) {
String s1="welcome";
int vowels=0,consonant=0;
for (int i = 0; i < s1.length(); i++) {
	char ch=s1.charAt(i);
if(ch=='a' || ch =='e'|| ch=='i'|| ch=='o'|| ch=='u') {
 vowels++;
}
 else
	 consonant++;
}
System.out.println("vowels "+vowels);	
System.out.println("consonants "+consonant);	
}	
	
}


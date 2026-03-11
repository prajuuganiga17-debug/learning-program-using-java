package com.tap.classes;

import java.util.Scanner;

public class Day19 {
	public static int countVowels(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a' ||ch=='e'|| ch=='i'||ch=='o'||ch=='u' 
					||ch=='A' ||ch=='E'|| ch=='I'||ch=='O'||ch=='U') {
				count++;
			}
			
		}
		return count;
//		enter the string
//		Prajwal
//		2
	}
	public static int countConsonants(String s) {
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(ch>='a'&& ch<='z'  ||ch>='A'&& ch<='Z') {
				if(!(ch=='a' ||ch=='e'|| ch=='i'||ch=='o'||ch=='u' 
						||ch=='A' ||ch=='E'|| ch=='I'||ch=='O'||ch=='U')) {
					count++;
				}
				
			}
			
			
		}
		return count;
//		enter the string
//		Prajwal */ Is a good boy
//		10
	
	}
	public static void countAllCharacters(String s) {
		int vc=0,cc=0,nc=0,spc=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a'&& ch<='z' || ch>='A'&& ch<='Z') {
				if(!(ch=='a' ||ch=='e'|| ch=='i'||ch=='o'||ch=='u' 
						||ch=='A' ||ch=='E'|| ch=='I'||ch=='O'||ch=='U')) {
					cc++;
				}
				else {
					vc++;
				}
				
			}
			else if(ch>='0' && ch<='9') {
				nc++;
			}
			else {
				spc++;
			}
		}
		System.out.println("vowels count: "+vc+" consonant count: "+cc);
		System.out.println(("numeric counts: "+nc+" special charracter count: "+spc));
//		enter the string
//		consistency is **** %#@ not 1 stretch game its a again and again restarting the gaming
//		vowels count: 23consonant count: 40
//		numeric counts: 1special charracter count: 22
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
//		System.out.println(countVowels(s));
//		System.out.println(countConsonants(s));
		countAllCharacters(s);
	}

}

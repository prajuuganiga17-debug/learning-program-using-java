package com.tap.classes;

import java.util.Scanner;

public class Day18 {
	public static String reverse(String s1){
		String t="";
		for(int i=s1.length()-1;i>=0;i--) {
			t=t+s1.charAt(i);
		}
		return  t;
//		java
//		avaj
		
	}
	public static String palindrome(String s) {
		int i=0,j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)==s.charAt(j)) {
				i++;
				j--;
			}
			else {
				return "not palindrome";
			}
		}
		return "palindrome";
//		racecar
//		palindrome
//		man
//		not palindrome

		
	}
	public static int  countWords(String s1) {
		int count=0;
		for(int i=0;i<s1.length();i++) {
			if((s1.charAt(i)==' ') && (s1.charAt(i+1)!=' ')) {
				count++;
			}
		}
		return s1.charAt(0)==' '?count:count+1;
//		   hello everyone my friend
//		   4

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1=sc.nextLine();
//		String s=reverse(s1);
//		System.out.println(s);
//		System.out.println(palindrome(s1));
		System.out.println(countWords(s1));
		

	}

}

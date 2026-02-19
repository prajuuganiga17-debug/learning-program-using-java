package com.tap.classes;
import java.util.Scanner;

public class Day6 {
	static void multiples(int x,int n){
		for(int i=x;i<=n;i++) {
			if(i%x==0) {
				System.out.println(i);
			}
		}
	}
	static void commonFactors(int n,int a,int b) {
		for(int i=1;i<=n;i++) {
			if(i%a==0 && i%b==0) {
				System.out.println(i+" ");
			}
		}
	}
	static void multiples(int n,int a,int b) {
		int count=1;
		for(int i=1;count<=n;i++) {
			if(i%a==0 && i%b==0) {
				count++;
				System.out.println(i);
			}
		}
	}
	static void commonFactors(int n1,int n2) {
		
		int n;
		if(n1>n2) {
			n=n2;
		}
		else {
			n=n1;
		}
		for(int i=1;i<=n;i++) {
			if(n1%i==0 && n2%i==0) {
				System.out.println(i);
			}
		}
	}
	static int greatestCommonDifference(int n1, int n2) {
		int n;
		if(n1>n2) {
			n=n2;
		}
		else {
			n=n1;
		}
		for(int i=n;i>=1;i--) {
			if(n1%i==0 && n2%i==0) {
				return i;
			}
		}
		return -1;
	}
	static int gcd(int n1, int n2) {

	    while(n2 != 0) {
	        int temp = n2;
	        n2 = n1 % n2;
	        n1 = temp;
	    }

	    return n1;
	}
	static int gcdd(int n1,int n2) {
		while(n2!=0) {
			int temp=n2;
			n2=n1%n2;
			n1=temp;
		}
		return n1;
	}
	static int lcm(int a,int b) {
		int lcm=(a*b)/gcd(a,b);
		return lcm;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
//		int b=sc.nextInt();
//		int a=sc.nextInt();
//		
//		int b=sc.nextInt();
		
//		int x=sc.nextInt();
//		int n=sc.nextInt();
//		multiples(x,n);
//		commonFactors(n, a, b);
//		
//		multiples(n,a,b);
//		
		
//		commonFactors( n1, n2);
//		System.out.println(greatestCommonDifference(n1,n2));
//		System.out.println(gcd(n1, n2));
//		
//		
//		System.out.println(lcm( n1,n2) );
		System.out.println(lcmd(n1,n2));
		
	}

}

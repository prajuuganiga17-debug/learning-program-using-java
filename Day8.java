package com.tap.classes;

import java.util.Scanner;

public class Day8 {
	public static int countDigit(int n) {
		int count=0;
		while(n!=0) {
			n/=10;
			count++;
		}
		return count;
	}
	public static boolean isAmstrong(int n){
		int count=countDigit( n);
		int originalNumber=n;
		int arm=0;
		while(n!=0) {
			int last=n%10;
			arm=arm+(int)Math.pow(last, count);
			n/=10;
		}
		return arm==originalNumber;
	}
	public static void ArmStrongNumber(int n1,int n2) {
		for(int i=n1;i<=n2;i++) {
			if(isAmstrong(i)) {
				System.out.println(i);
			}
		}
	}
	public static void swapNumber(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n1= scanner.nextInt();
		int n2= scanner.nextInt();
		
//		ArmStrongNumber(n1,n2);
		swapNumber(n1,n2);

//		System.out.println(isAmstrong(n));

	}

}

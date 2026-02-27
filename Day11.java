package com.tap.classes;

import java.util.Scanner;

public class Day11 {
	//ip - 5| 3 2 5 7 1 |o/p - 3 2 \ ........pairs
	static public void printPairs(int arr[]) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				System.out.println(arr[i]+" "+arr[j]);
			}
		}
	}
	//sum is eqaul to specific value k
	static public void printKey(int arr[],int k ){
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]+arr[j]==k) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}
	static void printkeySub(int arr[],int k) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]-arr[j]==k || arr[j]-arr[i]==k) {
					System.out.println(arr[i]+" "+arr[j]);

				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
		int n= sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		 printkeySub(arr, k);
//		printPairs(arr);
//		printKey(arr, k );
	}

}

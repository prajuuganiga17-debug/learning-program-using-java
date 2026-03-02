package com.tap.classes;

import java.util.Scanner;

public class Day12 {
	public static void printOccurrenceas(int arr[]){
		int count=1;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]==arr[i+1]) {
				count++;
			}
			else {
				System.out.println(arr[i]+"-"+count);
				count=1;
			}
		}
		System.out.println(arr[arr.length-1]+"-"+count);
	}
	public static void printElementsWR(int arr[]) {
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]!=arr[i+1]) {
				System.out.println(arr[i]);
			}
		}
		System.out.println(arr[arr.length-1]);
	}
	public static void Unique(int arr[]) {
		int count=1;
		
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]==arr[i+1]) {
				count++;
			}
			else {
				if(count==1) {
					System.out.println(arr[i]);
					
				}
				count=1;
			}
		}
		if(count==1) {
			System.out.println(arr[arr.length-1]);
		}
	}
	public static int UniqueCount(int arr[]) {
		int count=1,uniqueCount=0;
		
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]==arr[i+1]) {
				count++;
			}
			else {
				if(count==1) {
					uniqueCount++;
					
				}
				count=1;
			}
		}
		if(count==1) {
			uniqueCount++;	
			}
		return uniqueCount;
	}
	public static void notUniqueCount(int arr[]) {
		int count=1,uniqueCount=0;
		
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]==arr[i+1]) {
				count++;
			}
			else {
				if(count>1) {
					System.out.println(arr[i]);
					
				}
				count=1;
			}
		}
		if(count>1) {
			System.out.println(arr[arr.length-1]);	
			}
		
	}
	public static int largestRepeatingElement(int arr[]) {
		for (int i = arr.length-1; i >0; i--) {
			if(arr[i]==arr[i-1]) {
				return arr[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
//		printOccurrenceas( arr);
//		printElementsWR( arr);
//		Unique( arr);
//		System.out.println(UniqueCount( arr));
//		notUniqueCount(arr);
		System.out.println(largestRepeatingElement( arr));
	}

}

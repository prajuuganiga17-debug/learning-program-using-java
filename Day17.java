package com.tap.classes;

import java.util.Scanner;

public class Day17 {
	public static void consecutive(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]-arr[i]==1) {
				System.out.print(arr[i]+" ");
			}
			else {
				System.out.print(arr[i]+" ");
				System.out.println();
			}
		}
		System.out.println(arr[arr.length-1]);
//		10
//		5 12 13 14 9 2 3 4 5 8
//		5 
//		12 13 14 
//		9 
//		2 3 4 5 
//		8

	}
	public static void consecutivedec(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]-arr[i+1]==1) {
				System.out.print(arr[i]+" ");
			}
			else {
				System.out.print(arr[i]+" ");
				System.out.println();
			}
		}
		System.out.println(arr[arr.length-1]);
//		5
//		3 2 1 5 4 
//		3 2 1 
//		5 4


	}
	public static void countConsecutiveEle(int arr[]) {
		int count=1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]-arr[i]==1) {
				count++;
			}
			else {
				
				System.out.println(count);
				count=1;
				
			}
		}
//		10
//		5 12 13 14 9 2 3 4 5 8
//		1
//		3
//		1
//		4

	}
	public static void longestconselength(int arr[]) {
		int count=1;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]-arr[i]==1) {
				count++;
			}
			else {
				if(count>max) {
					max=count;
				}
				count=1;
			}
		}
		
		if(count>max) {
			max=count;
		}
		System.out.println(max);
	}
	public static void longestcosnecutiveSubarray(int arr[]) {
		int count =1;
		int ei=0,si;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]-arr[i]==1) {
				count++;
			}
			else {
				if(count>max) {
					max=count;
					ei=i;
				}
				count=1;
			}
		}
		if(count>max) {
			max=count;
			ei=arr.length-1;
		}
		si=ei-max+1;
		for(int i=si;i<=ei;i++) {
			System.out.println(arr[i]+" ");
		}
		
	}
	//sorted array
	public static void sorted(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]<arr[i+1]) {
				System.out.print(arr[i]+" ");
			}
			else {
				System.out.print(arr[i]);
				System.out.println();
			}
		}
		System.out.println(arr[arr.length-1]);
//		8
//		5 6 8 10 3 5 4 7 
//		5 6 8 10
//		3 5
//		4 7
	}
	public static void rearrangeArray(int arr[]) {
		int pos=0;
		int temp;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				temp=arr[i];
				for(int j=i;j>pos;j--) {
					arr[j]=arr[j-1];
				}
				arr[pos]=temp;
				pos++;
			}
		}
//		4
//		-3 5 -1 2
//		5 2 -3 -1 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
//		consecutive(arr);
//		consecutivedec(arr);
//		countConsecutiveEle(arr);
//		longestconselength(arr);
//		longestcosnecutiveSubarray(arr);
//		sorted(arr);
		rearrangeArray(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}

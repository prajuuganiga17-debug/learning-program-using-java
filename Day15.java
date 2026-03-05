package com.tap.classes;

import java.util.Scanner;

public class Day15 {
	//sum of subarray of size k
	public static void subArraySum(int arr[],int k) {
		for(int i=0;i<=arr.length-k;i++) {
			int sum=0;
			for(int j=i;j<i+k;j++) {
				sum+=arr[j];
			}
			System.out.println(sum);
		}
//		9
//		5 1 2 4 9 3 1 3
//		3
//		3
//		8
//		7
//		15
//		16
//		13
//		7

	}
	
	//count the number of subarray is equal to k
	public static int countSubArraySum(int arr[],int size,int k) {
		int count=0;
		for(int i=0;i<=arr.length-size;i++) {
			int sum=0;
			for(int j=i;j<i+size;j++) {
				sum+=arr[j];
			}
			if(sum==k) {
//				for(int j=i;j<i+size;j++) {
//					
//				}
				count++;
			}
		}
		return count;
	}
	
	public static void printSubArraySum(int arr[],int size,int k) {
		
		for(int i=0;i<=arr.length-size;i++) {
			int sum=0;
			for(int j=i;j<i+size;j++) {
				sum+=arr[j];
			}
			if(sum==k) {
				for(int j=i;j<i+size;j++) {
					System.out.print(arr[j]+" ");
				}
				System.out.println();
			}
		}
//		9
//		5 1 2 4 9 3 1 3 3
//		3
//		7
//		1 2 4 
//		3 1 3 
//		1 3 3 
	
	}
	
	//print all the subarray of an array
	public static void printSubArray(int arr[]) {
		for(int size=1;size<=arr.length;size++) {
			for(int i=0;i<=arr.length-size;i++) {
				for(int j=i;j<i+size;j++) {
					System.out.print(arr[j]+" ");
				}
				System.out.println();
			}
		}
//		5
//		3 5 1 7 2
//		3 
//		5 
//		1 
//		7 
//		2 
//		3 5 
//		5 1 
//		1 7 
//		7 2 
//		3 5 1 
//		5 1 7 
//		1 7 2 
//		3 5 1 7 
//		5 1 7 2 
//		3 5 1 7 2 

	}
	// sumof all the subarray sum
	public static void subArraySum(int arr[]) {
		for(int size=1;size<=arr.length;size++) {
			
			for(int i=0;i<=arr.length-size;i++) {
				int sum=0;
				for(int j=i;j<i+size;j++) {
					sum+=arr[j];
				}
				System.out.println(sum);
			}
		}
	}
	
	// print the count of sub arrray sumis equal to k
	public static int  subArrayCount(int arr[],int k) {
		int count=0;
		for(int size=1;size<=arr.length;size++) {
			
			for(int i=0;i<=arr.length-size;i++) {
				int sum=0;
				for(int j=i;j<i+size;j++) {
					sum+=arr[j];
				}
				if(sum==k) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
//		int size=sc.nextInt();
		
//		subArraySum(arr,size);
//		System.out.println(countSubArraySum(arr,size,k));
//		printSubArraySum(arr,size,k);
//		printSubArray(arr);
		subArraySum(arr);
		int k=sc.nextInt();
		System.out.println(subArrayCount(arr,k));

	}

}

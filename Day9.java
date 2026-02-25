package com.tap.classes;

import java.util.Scanner;

public class Day9 {
	public static int max(int arr[]){
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(max>arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	public static int min(int arr[]){
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(min<arr[i]) {
				min=arr[i];
			}
		}
		return min;
	}
	public static int sumOfArray(int arr[]){
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
	public static int largestElemIndex(int arr[]) {
		int max=Integer.MIN_VALUE;
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				index=i;
			}

		}
		return index;
	}
	public static int occurrence(int arr[],int k) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(k==arr[i]) {
				count++;
			}
		}
		return count++;
	}
	public static int findIndex(int arr[],int k) {
		for (int i = 0; i < arr.length; i++) {
			if(k==arr[i]) {
				return i;
			}
		}
		return -1;
	}
	public static int findLIndex(int arr[],int k) {
		for (int i = arr.length-1; i >=0; i++) {
			if(k==arr[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of elements");
		int n=sc.nextInt();
		int arr[]=new  int [n];
		int k=1;
		System.out.println("enter the elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		//		System.out.println(largestElemIndex( arr));
		//		System.out.println(occurrence( arr,k));
		//		System.out.println(findIndex(arr, k));
//		System.out.println(findLIndex( arr, k));
		System.out.println(sumOfArray(arr));
		System.out.println(max( arr));
//		int sum_max=-;
//		int sum_min=sumOfArray(arr)-min( arr);
//		System.out.println(sum_max);
//		System.out.println(sum_min);


	}

}

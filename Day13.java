package com.tap.classes;

import java.util.Scanner;

public class Day13 {
	public static void commonElments(int arr1[],int arr2[]) {
		System.out.println("tin");
		int i=0,j=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]==arr2[j]) {
				System.out.println(arr1[i]);
				i++;
				j++;
			}
			else if(arr1[i]>arr2[j]){
				j++;
				
			}
			else {
				i++;
			}
		}
	}
	
	//descending order elements
	public static void commonElmentsdec(int arr1[],int arr2[]) {
		
		int i=arr1.length-1,j=arr2.length-1;
		while(i>=0 && j>=0) {
			if(arr1[i]==arr2[j]) {
				System.out.println(arr1[i]);
				i--;
				j--;
			}
			else if(arr1[i]<arr2[j]){
				j--;
				
			}
			else {
				i--;
			}
		}
	}
	public static void commonInAscAdsc(int arr1[],int arr2[]) {
		int i=arr1.length-1,j=0;
		while(i>=0 && j<arr2.length) {
			if(arr1[i]==arr2[j]) {
				System.out.println(arr1[i]);
				i--;
				j++;
			}
			else if(arr1[i]<arr2[j]){
				i--;

			}
			else {
				j++;
			}
		}
	}
	public static int [] MergeTwArrays(int arr1[],int arr2[]) {
		int res[]=new int [arr1.length+arr2.length];
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<=arr2[j]) {
				res[k++]=arr1[i++];
			}
			else {
				res[k++]=arr2[j++];
			}
		}
		while(j<arr2.length) {
			res[k++]=arr2[j++];
		}
		while(i<arr1.length) {
			res[k++]=arr1[i++];
		}
		return res;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		
		int arr1[]=new int[n];
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=scan.nextInt();
		}
		int N=scan.nextInt();
		int arr2[]=new int[N];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=scan.nextInt();
		}
//		commonElmentsdec(arr1,arr2);
//		commonInAscAdsc(arr1,arr2);
		int res[]=MergeTwArrays(arr1,arr2);
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
	}

}

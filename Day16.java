package com.tap.classes;

import java.util.Scanner;

public class Day16 {
	//write program all -1 are at the last and all positive numbers at starting
	
	
	public static void rearrangeArray(int arr[]) {
		int i=arr.length-1;
		int j=arr.length-1;
		while(i>=0) {
			if(arr[i]==-1) {
				i--;
			}
			else {
				arr[j]=arr[i];
				j--;
				i--;
			}
		}
		while(j>=0) {
			arr[j]=-1;
			j--;
		}
	}
	//rearrange the array such that if there is a 0 element present in the array that come in the first and the other elements
	public static void rearrangeZero(int arr[]) {
		int i=0,j=0;
		while(i<arr.length) {
			if(arr[i]==0) {
				i++;
			}
			else {
				arr[j]=arr[i];
				i++;
				j++;
			}
		}
		while(j<arr.length) {
			arr[j++]=0;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
//		rearrangeArray(arr);
		rearrangeZero(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}

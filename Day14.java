package com.tap.classes;

import java.util.Scanner;

public class Day14 {
	public static void subArray(int arr[],int size,int k) {

		for(int i=0;i<=arr.length-size;i++) {
			int sum=0;
			for(int j=i;j<i+size;j++) {
				sum+=arr[j];
			}
			if(sum==k) {
				for(int m=i;m<i+size;m++) {
					System.out.print(arr[m]+" ");
				}
				System.out.println();
				System.exit(0);

			}
		}
	}
	//	input
	//	10
	//	1 5 0 0 1 2 0 3 0 6
	//	6
	//	output
	//	0 0 1 2 0 3 0 
	public static int [] mergeArray(int arr1[],int arr2[],int arr3[]) {
		int i=0,k=0;
		int res[]=new int[arr1.length+arr2.length+arr3.length];
		while(k<res.length) {
			if(i<arr1.length) {
				res[k++]=arr1[i];
			}
			if(i<arr2.length) {
				res[k++]=arr2[i];
			}
			if(i<arr3.length) {
				res[k++]=arr3[i];
			}
			i++;
		}
		return res;
	}
//	5
//	1 2 3 4 5
//	3
//	4 3 5
//	2
//	5 1
//	o/p
//	1 4 5 2 3 1 3 5 4 5 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//		int n= sc.nextInt();
		//		int arr[]=new int [n];
		//		for (int i = 0; i < arr.length; i++) {
		//			arr[i]=sc.nextInt();
		//	}
		//		int k= sc.nextInt();
		//		for(int i=arr.length-1;i>0;i--) {
		//			subArray(arr,i,k);
		//		}
		int n= sc.nextInt();
		int arr1[]=new int [n];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=sc.nextInt();
		}
		int N= sc.nextInt();
		int arr2[]=new int [N];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=sc.nextInt();
		}
		int m= sc.nextInt();
		int arr3[]=new int [m];
		for (int i = 0; i < arr3.length; i++) {
			arr3[i]=sc.nextInt();
		}
		int res[]=mergeArray(arr1,arr2,arr3);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
		}
		
	}
}

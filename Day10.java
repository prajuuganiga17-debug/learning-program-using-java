package com.tap.classes;

import java.util.Iterator;
import java.util.Scanner;

public class Day10 {
	public static int product(int arr[]){
		int product=1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0) {
				product*=arr[i];
			}
			
		}
		return product;
	}
	public static int[] productOfArray(int arr[]){
		int product=product( arr);
		int res []=new int [arr.length];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				res[i]=product/arr[i];
			}
			
		}
		return res;
	}
	public static int secondLargest(int arr[]) {
		int fL=Integer.MIN_VALUE,sL=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(fL<arr[i]) {
				sL=fL;;
				fL=arr[i];
			}
			else if(sL<arr[i]) {
				sL=arr[i];
			}
		}
		return sL;
	}
	public static int thirdLargest(int arr[]) {
		int fL=Integer.MIN_VALUE,sL=Integer.MIN_VALUE,tL=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(fL<arr[i]) {
				tL=sL;
				sL=fL;;
				fL=arr[i];
			}
			else if(sL<arr[i]) {
				tL=sL;
				sL=arr[i];
			}
			else if(tL<arr[i]) {
				tL=arr[i];
				
			}
		}
		return tL;
	}
	//tassks
	public static int maxSumPairs(int arr[]) {
		int fL=Integer.MIN_VALUE,sL=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(fL<arr[i]) {
				sL=fL;;
				fL=arr[i];
			}
			else if(sL<arr[i]) {
				sL=arr[i];
			}
		}
		return sL+fL;
	}
	public static int maxProduct(int arr[]) {
		int fL=Integer.MIN_VALUE,sL=Integer.MIN_VALUE;
		int fS=Integer.MAX_VALUE,sS=Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if(fL<arr[i]) {
				sL=fL;
				fL=arr[i];
			}
			else if(sL<arr[i]) {
				sL=arr[i];
			}
			if(fS>arr[i]) {
				sS=fS;
				fS=arr[i];
			}
			else if(sS>arr[i]) {
				sS=arr[i];
			}
		}
		int p1=fL*sL;
		int p2=sS*fS;
		int p3=fL*fS;
		int max=p1>p2?p1:p2;
		int maxs=max>p3?max:p3;
		return maxs;
	}
	public static int minProduct(int arr[]) {
		int fL=Integer.MIN_VALUE,sL=Integer.MIN_VALUE;
		int fS=Integer.MAX_VALUE,sS=Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if(fL<arr[i]) {
				sL=fL;
				fL=arr[i];
			}
			else if(sL<arr[i]) {
				sL=arr[i];
			}
			if(fS>arr[i]) {
				sS=fS;
				fS=arr[i];
			}
			else if(sS>arr[i]) {
				sS=arr[i];
			}
		}
		int p1=fL*sL;
		int p2=sS*fS;
		int p3=fL*fS;
		int min=p1<p2?p1:p2;
		int mins=min<p3?min:p3;
		return mins;
	}
	public static int secondSmallest(int arr[]) {
		int fL=Integer.MAX_VALUE,sL=Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(fL>arr[i]) {
				sL=fL;;
				fL=arr[i];
			}
			else if(sL>arr[i]) {
				sL=arr[i];
			}
		}
		return sL;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=scanner.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scanner.nextInt();
		}
//		int res[]=productOfArray( arr);
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(res[i]);
//		}
//		System.out.println(secondLargest(arr));
//		System.out.println(thirdLargest( arr));
		System.out.println(secondSmallest( arr));
		
		
	}

}

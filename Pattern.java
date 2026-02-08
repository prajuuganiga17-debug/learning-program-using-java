//package tapacademy;
//
//import java.util.Scanner;
//
//class Pattern {
//	
//	public static void main(String args[]) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("enter the number of rows");
//		int n= scanner.nextInt();
//		for(int i=1; i<=n; i++) {
//			for(int j=1;j<=n;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//}
//package tapacademy;
//import java.util.Scanner;
//
//class Pattern{
//	public static void main(String [] args) {
//		System.out.println("enter the number of rows");
//
//		Scanner scanner=new Scanner(System.in);
//		int n= scanner.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
//	}
//}

//package tapacademy;
//
//import java.util.Scanner;
//
//class Pattern{
//	public static void main (String args[]) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("enter the number of rows");
//		int n= scanner.nextInt();
//		for(int i=1; i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if (i==1 || i==n || j==1 ||j==n) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
//		
//	}
//}

//package tapacademy;
//
//import java.util.Scanner;
//
//class Pattern{
//	public static void main (String args[]) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("enter the number of rows");
//		int n= scanner.nextInt();
//		int count=1;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if(count<10) {
//					System.out.print("0");
//				}
//				System.out.print(count++ +" ");
//			}
//			System.out.println();
//		}
//		
//	}
//}


//package tapacademy;
//
//import java.util.Scanner;
//
//class Pattern{
//	public static void main (String args[]) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("enter the number of rows");
//		int n= scanner.nextInt();
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n; j++) {
//				if((i*j)<10) {
//					System.out.print("0");
//				}
//				System.out.print(i*j +" ");
//			}
//			System.out.println();
//		}
//		
//	}
//}
//enter the number of rows
//5
//01 02 03 04 05 
//02 04 06 08 10 
//03 06 09 12 15 
//04 08 12 16 20 
//05 10 15 20 25 



//package tapacademy;
//
//import java.util.Scanner;
//
//class Pattern{
//	public static void main (String args[]) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("enter the number of rows");
//		int n= scanner.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if((i+j)-1<10) {
//					System.out.print("0");
//				}
//				System.out.print(i+j-1 + " ");
//			}
//			System.out.println();
//		}
//	
//		
//	}
//}
//enter the number of rows
//5
//01 02 03 04 05 
//02 03 04 05 06 
//03 04 05 06 07 
//04 05 06 07 08 
//05 06 07 08 09


//package tapacademy;
//
//import java.util.Scanner;
//
//class Pattern{
//	public static void main (String...args) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("enter the number of rows");
//		int n= scanner.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//	}
//}
//
//enter the number of rows
//5
//*
//**
//***
//****
//*****

//package tapacademy;
//
//import java.util.Scanner;
//
//class Pattern{
//	public static void main (String...args) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("enter the number of rows");
//		int n= scanner.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				if(j<10) {
//					System.out.print("0");
//			}
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
//		
//		
//	}
//}
//enter the number of rows
//5
//01 
//01 02 
//01 02 03 
//01 02 03 04 
//01 02 03 04 05 


//package tapacademy;
//
//import java.util.Scanner;
//
//class Pattern{
//	public static void main (String...args) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("enter the number of rows");
//		int n= scanner.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1; j<=i;j++) {
//				if(j<10) {
//				System.out.print("0");
//			}
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
//		
//	}
//}
//enter the number of rows
//5
//01 
//01 02 
//01 02 03 
//01 02 03 04 
//01 02 03 04 05 


//package tapacademy;
//
//import java.util.Scanner;
//
//class Pattern{
//	public static void main (String...args) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("enter the number of rows");
//		int n= scanner.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n-i;j++) {
//				System.out.print("  ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//		
//	}
//}
//enter the number of rows
//4
//      * 
//    * * 
//  * * * 
//* * * * 

//package tapacademy;
//
//import java.util.Scanner;
//
//class Pattern{
//	public static void main (String...args) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("enter the number of rows");
//		int n= scanner.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n-i;j++) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//		
//	}
//}
//enter the number of rows
//4
//   * 
//  * * 
// * * * 
//* * * * 




//
//package tapacademy;
//
//import java.util.Scanner;
//
//class Pattern{
//	public static void main (String...args) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("enter the number of rows");
//		int n= scanner.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n-i;j++) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++) {
//				if(k==1||i==n||k==i) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
//		
//		
//	}
//}
//
//enter the number of rows
//5
//    * 
//   * * 
//  *   * 
// *     * 
//* * * * * 



//package tapacademy;
//
//import java.util.Scanner;
//
//class Pattern{
//	public static void main (String...args) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("enter the number of rows");
//		int n= scanner.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n-i;j++) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++) {
//				if(k==1||i==n||k==i) {
//					System.out.print( k+" ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
//		
//		
//	}
//}
//enter the number of rows
//5
//    1 
//   1 2 
//  1   3 
// 1     4 
//1 2 3 4 5 


//package tapacademy;
//
//import java.util.Scanner;
//
//class Pattern{
//	public static void main (String...args) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("enter the number of rows");
//		int n= scanner.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				if(j==1||j==i||i==n) {
//					System.out.print(j+" ");
//				}
//				else {
//					System.out.print("  ");
//				}
//				
//			}
//			System.out.println();
//		}
//		
//	}
//}
//enter the number of rows
//5
//1 
//1 2 
//1   3 
//1     4 
//1 2 3 4 5 



//package tapacademy;
//
//import java.util.Scanner;
//
//class Pattern{
//	public static void main (String...args) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("enter the number of rows");
//		int n= scanner.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
//		
//	}
//}
//enter the number of rows
//5
//1 
//1 2 
//1 2 3 
//1 2 3 4 
//1 2 3 4 5 


//package tapacademy;
//
//import java.util.Scanner;
//
//class Pattern{
//	public static void main (String...args) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("enter the number of rows");
//		int n= scanner.nextInt();
//		for(int i=1;i<=n;i++) {
//			int count=i;
//			for(int j=1;j<=n-i+1;j++) {
//				System.out.print(count++ +" ");
//			}
//			System.out.println();
//		}
//		
//		
//	}
//}
//
//
//enter the number of rows
//5
//1 2 3 4 5 
//2 3 4 5 
//3 4 5 
//4 5 
//5


//package tapacademy;
//
//import java.util.Scanner;
//
//class Pattern{
//	public static void main (String...args) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("enter the number of rows");
//		int n= scanner.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=(2*i)-1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//	}
//}
//
//enter the number of rows
//5
//*
//***
//*****
//*******
//*********




//package tapacademy;
//
//import java.util.Scanner;
//
//class Pattern{
//	public static void main (String...args) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("enter the number of rows");
//		int n= scanner.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n-i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=(2*i)-1;j++ ) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		
//	}
//}
//
//enter the number of rows
//4
//   *
//  ***
// *****
//*******



//package tapacademy;
//
//import java.util.Scanner;
//
//class Pattern{
//	public static void main (String...args) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("enter the number of rows");
//		int n= scanner.nextInt();
//		for(int i=1;i<n;i++) {
//			int count=1;
//			for(int j=1;j<=(2*i)-1;j++) {
//				
//				if(j<i) {
//					System.out.print(count++);
//
//				}
//				else {
//					System.out.print(count--);
//				}
//			}
//			System.out.println();
//		}
//		
//	}
//}
//
//enter the number of rows
//5
//1
//121
//12321
//1234321



//package tapacademy;
//
//import java.util.Scanner;
//
//class Pattern{
//	public static void main (String...args) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("enter the number of rows");
//		int n= scanner.nextInt();
//		for(int i=1;i<=n;i++) {
//			int count=1;
//			for(int j=1;j<=n-i;j++) {
//				System.out.print("  ");
//			}
//			for(int j=1;j<=(2*i)-1;j++) {
//				if(j<i) {
//					System.out.print(count++ +" ");
//				}
//				else {
//					System.out.print(count-- +" ");
//	
//				}
//			}
//			System.out.println();
//		}
//		
//		
//	}
//}
//
//enter the number of rows
//5
//        1 
//      1 2 1 
//    1 2 3 2 1 
//  1 2 3 4 3 2 1 
//1 2 3 4 5 4 3 2 1 


//package tapacademy;
//
//import java.util.Scanner;
//
//class Pattern{
//	public static void main (String...args) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("enter the number of rows");
//		int n= scanner.nextInt();
//		for(int i=1;i<=n;i++) {
//			if(i%2==0) {
//				System.out.print(i+1+" ");
//			}
//			for(int j=1;j<=n;j++) {
//				System.out.print(i+" ");
//			}
//			if(i%2!=0) {
//				System.out.print(i+1+" ");
//			}
//			System.out.println();
//		}
//		
//	}
//}
//enter the number of rows
//5
//1 1 1 1 1 2 
//3 2 2 2 2 2 
//3 3 3 3 3 4 
//5 4 4 4 4 4 
//5 5 5 5 5 6 


//package tapacademy;
//
//import java.util.Scanner;
//
//class Pattern{
//	public static void main (String...args) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("enter the number of rows");
//		int n= scanner.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
//		for(int i=1;i<=n-1;i++) {
//			for(int j=1;j<=n-i;j++) {
//				System.out.print(n-i);
//			}
//			System.out.println();
//		}
//		
//	}
//}
//
//
//enter the number of rows
//5
//1
//22
//333
//4444
//55555
//4444
//333
//22
//1



//package tapacademy;
//
//import java.util.Scanner;
//
//class Pattern{
//	public static void main (String...args) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("enter the number of rows");
//		int n= scanner.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n-i;j++) {
//				System.out.print(" ");
//				
//			}
//			for(int j=1;j<=2*i-1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=2*(n-i)-1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//}































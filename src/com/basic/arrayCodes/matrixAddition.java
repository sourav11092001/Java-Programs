package com.basic.arrayCodes;

import java.util.Scanner;



class matrixOps{
	int arr1[][];
	int arr2[][];
	int res[][];
	Scanner sc = new Scanner(System.in);
	public void collectDataArray1(int[][] m1,int n)
	{
		arr1 =m1;
		System.out.println("collecting data for Array 1");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr1[i][j]= sc.nextInt();
			}
		}
	}
	public void collectDataArray2(int[][] m2,int n)
	{
		arr2 =m2;
	System.out.println("collecting data for Array 2");
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			arr2[i][j]= sc.nextInt();
		}
	}
}
 
	public void calculate(int[][] res1, int n) {
		res = res1;
		System.out.print("collecting the sum ");
		System.out.println();
		for( int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				res[i][j] = arr1[i][j]+arr2[i][j];
			}
		}
	}
	
	public void displayResult(int n) {
		System.out.println("display the sum :");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(res[i][j]+"  ");
			}
				
			System.out.println();
		}
	}
	
	
}


public class matrixAddition {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the array size");
		 int n =  sc.nextInt();
		 
		 int m1[][] = new int [n][n];
		 int m2[][] = new int [n][n];
		 int res[][] = new int [n][n];
		 
		 matrixOps mo = new matrixOps();
		 mo.collectDataArray1(m1, n);
		 mo.collectDataArray2(m2, n);
		 mo.calculate(res, n);
		 mo.displayResult(n);
	}
}

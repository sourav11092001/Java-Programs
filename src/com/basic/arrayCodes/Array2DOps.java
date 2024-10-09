package com.basic.arrayCodes;

import java.util.Scanner;

public class Array2DOps {
		 public static String arr[][];
		    public Scanner sc = new Scanner(System.in);
		    public void createArray(int cls, int stu){
		        arr = new String[cls][stu];
		    }
		    public void insertData(int cls, int stu){
		        System.out.println("collecting Student Name: ");
		        for (int i = 0; i < cls; i++) {
		            System.out.println("Insede the class number: "+ (i+1));
		            for (int j = 0; j < stu; j++) {
		                System.out.println("Enter the nane of student number : " +(j+1));
		                arr[i][j] = sc.next();
		            }
		        }
		        System.out.println("Data is loaded on to the array");
		        System.out.println("--------------------------------------");
		    }

		    public void displayData(int cls, int stu){
		        System.out.println("Displaying Student Name: ");
		        for (int i = 0; i < cls; i++) {
		            System.out.println("Insede the class number: "+ (i+1));
		            for (int j = 0; j < stu; j++) {
		                System.out.println("Enter the nane of student number : " +(j+1) + " is = " + arr[i][j]);
		            }
		        }
		        System.out.println("--------------------------------------");
		    }
}

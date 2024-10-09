package com.basic.arrayCodes;

import java.util.Scanner;

public class Array2DMain {
	 public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);
	         Array2DOps ao = new Array2DOps();
	         System.out.println("Enter the class count: ");
	         int cls = sc.nextInt();
	         System.out.println("Enter the student count in each class: ");
	         int stu= sc.nextInt();
	         ao.createArray(cls, stu); 
	         ao.insertData(cls, stu);
	         ao.displayData(cls, stu);
	        }       
}

package com.Multitreading;

import java.util.Scanner;

class Operation1 extends Thread{
	Scanner sc = new Scanner(System.in);
	@Override
	public void run() {
		System.out.println("Addition Operation starter");
		System.out.println("Enter the first number");
		int add1 = sc.nextInt();
		System.out.println("Enter the second number");
		int add2 = sc.nextInt();
		int res = add1 + add2;
		System.out.println("The result is : " + res);
		System.out.println("Addition Operation completed");
	}
}

class Operation2 extends Thread{
	Scanner sc = new Scanner(System.in);
	@Override
	public void run() {
		System.out.println("Multiplication Operation starter");
		System.out.println("Enter the first number");
		int mul1 = sc.nextInt();
		System.out.println("Enter the second number");
		int mul2 = sc.nextInt();
		int res2 = mul1 * mul2;
		System.out.println("The result is : " + res2);
		System.out.println("Miltiplocation Operation completed");
	}
}


class Operation3 extends Thread{
	Scanner sc = new Scanner(System.in);
	@Override
	public void run() {
		try {
			System.out.println("Printiing-1 started");
			for(int i = 1; i <= 5; i++) {
				System.out.println("Happy Dewpavali");
				Thread.sleep(4000);
			}
			System.out.println("Printing-1 completed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


class Operation4 extends Thread{
	Scanner sc = new Scanner(System.in);
	@Override
	public void run() {
		try {
			System.out.println("Printiing-1 started");
			for(int i = 1; i <= 5; i++) {
				System.out.println("Happy Kannada Rajyothsva");
				Thread.sleep(4000);
			}
			System.out.println("Printing-2 completed");
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
}

public class Multitreading {

	public static void main(String[] args) {
		Operation1 op1 = new Operation1();
		Operation2 op2 = new Operation2();
		Operation3 op3 = new Operation3();
		Operation4 op4 = new Operation4();
		
		op1.start();
		op2.start();
		op3.start();
		op4.start();

	}

}

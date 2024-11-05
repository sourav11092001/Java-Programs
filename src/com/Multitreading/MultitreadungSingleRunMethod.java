package com.Multitreading;

import java.util.Scanner;

class Operation extends Thread {
	Scanner sc = new Scanner(System.in);
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("add")) {
			add();
		}
		else if(Thread.currentThread().getName().equals("mul")) {
			mul();
		}
		else if(Thread.currentThread().getName().equals("print1")) {
			print1();
		}
		else {
			print2();
		}
	}
	
	public void add() {
		System.out.println("Addition Operation starter");
		System.out.println("Enter the first number");
		int add1 = sc.nextInt();
		System.out.println("Enter the second number");
		int add2 = sc.nextInt();
		int res = add1 + add2;
		System.out.println("The result is : " + res);
		System.out.println("Addition Operation completed");
	}
	
	public void mul() {
		System.out.println("Multiplication Operation starter");
		System.out.println("Enter the first number");
		int mul1 = sc.nextInt();
		System.out.println("Enter the second number");
		int mul2 = sc.nextInt();
		int res2 = mul1 * mul2;
		System.out.println("The result is : " + res2);
		System.out.println("Miltiplocation Operation completed");
	}
	
	public void print1() {
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
	
	public void print2() {
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

public class MultitreadungSingleRunMethod {

	public static void main(String[] args) {
		Operation op1 = new Operation();
		Operation op2 = new Operation();
		Operation op3 = new Operation();
		Operation op4 = new Operation();
		
		op1.setName("add");
		op2.setName("mul");
		op3.setName("print1");
		op4.setName("print2s");
		
		op1.start();
		op2.start();
		op3.start();
		op4.start();
	}

}

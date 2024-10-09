package com.method;

class Over{
	int  add(int a, int b) {
		return a+b;
	}
	
	int  add(int a, int b, int c) {
		return a+b+c;
	}
	
	float  add(float a, float b) {
		return a+b;
	}
	
	float  add(float a, float b, float c) {
		return a+b+c;
	}
	
	double  add(double a, double b) {
		return a+b;
	}
	
	double  add(double a, double b, double c) {
		return a+b+c;
	}
	
	float  add(int a, float b) {
		return a+b;
	}
	
	float  add(float a, int b) {
		return a+b;
	}
	
	double  add(int a, float b, double c) {
		return a+b+c;
	}
	
}


public class Overloading {

	public static void main(String[] args) {
		Over a = new Over();
		System.out.println(a.add(10, 10));
		System.out.println(a.add(10.7f, 10.9f));
		System.out.println(a.add(555.545, 656.891));

	}

}

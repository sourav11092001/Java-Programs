package com.method;

class Dog extends Object{
	private String name;
	private String color;
	private int cost;
	private int age;
	private String breed;
	
	public Dog() {
		super();
		System.out.println("Showing value after executing zero parameterized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);
		System.out.println("=========================================");
	}
	
	public Dog(String name) {
		this("tommy", "yellow");
		this.name = name;
		System.out.println("Showing value after executing zero parameterized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);
		System.out.println("=========================================");
	}
	
	public Dog(String name, String color) {
		this("Rocky", "Brown", 7000);
		this.name = name;
		this.color = color;
		System.out.println("Showing value after executing zero parameterized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);
		System.out.println("=========================================");
	}
	
	public Dog(String name, String color, int cost) {
		this("Shocky", "black", 9000, 5);
		this.name = name;
		this.color = color;
		this.cost = cost;
		System.out.println("Showing value after executing zero parameterized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);
		System.out.println("=========================================");
	}
	
	public Dog(String name, String color, int cost, int age) {
		this("Bunty", "white", 9000, 6, "GR");
		this.name = name;
		this.color = color;
		this.cost = cost;
		this.age = age;
		System.out.println("Showing value after executing zero parameterized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);
		System.out.println("=========================================");
	}
	
	public Dog(String name, String color, int cost, int age, String breed) {
		this();
		this.name = name;
		this.color = color;
		this.cost = cost;
		this.age = age;
		this.breed = breed;
		System.out.println("Showing value after executing zero parameterized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);
		System.out.println("=========================================");
		
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getCost() {
		return cost;
	}

	public int getAge() {
		return age;
	}

	public String getBreed() {
		return breed;
	}
}

public class lanuchDog {
	public static void main(String[] args) {
		
		Dog d = new Dog("harsh");
		System.out.println(d.getName());
		System.out.println(d.getColor());
		System.out.println(d.getCost());
		System.out.println(d.getAge());
		System.out.println(d.getBreed());
		
	}
}

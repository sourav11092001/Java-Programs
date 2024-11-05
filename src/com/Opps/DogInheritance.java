package com.Opps;

class Animal {
	void eat() {
		System.out.println("Animal is eating");
	}
	
	void walk() {
		System.out.println("Animal is walking");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("Dog is eating");
	}
	void bark() {
		System.out.println("Dog is barking");
	}
}

class Cat extends Animal {
	void eat() {
		System.out.println("Cat is eating");
	}
	void bark() {
		System.out.println("Cat is barking");
	}
}

class Cow extends Animal {
	void eat() {
		System.out.println("Cow is eating");
	}
	void bark() {
		System.out.println("Cow is barking");
	}
}


public class DogInheritance {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.eat();
		d.bark();
		d.walk();
		System.out.println("===========================");
		
		Cat c = new Cat();
		c.eat();
		c.bark();
		c.walk();
		System.out.println("===========================");
		
		Cow cw = new Cow();
		cw.eat();
		cw.bark();
		cw.walk();
		System.out.println("===========================");
	}

}




package com.firstProgram;

public class Dog {
	  String name;
	  int age;
	  String breed;

	    public Dog(String name, int age, String breed) {
	        this.name = name;
	        this.age = age;
	        this.breed = breed;
	    }
	  
	     String getName() {
	        return name;
	    }
	     
	     int getAge() {
	    	 return age;
	     }

	     String getBreed() {
	    	 return breed;
	     }
	     
	     void Display(String name, int age, String breed) {
	    	 this.name = name;
	    	 this.age = age;
	    	 this.breed = breed;
	    	 System.out.println("Dog name: " + name + "age: " + age + "breed: " + breed);
	     }
	     
	     

	    public static void main(String[] args) {
	        Dog dog1 = new Dog("Max", 5, "Labrador");
	                 dog1.Display("Max", 5, "Labrador");
	    }
}
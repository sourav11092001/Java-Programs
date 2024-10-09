package com.firstProgram;

class Student{
    String name;
    int age;
    String grade;
    
    public Student(){
        this.name = "unknown";
        this.age = 0;
        this.grade = "not assigend";
    }
    
    public Student(String name){
        this.name = name;
        this.age = 0;
        this.grade = "not assigend";
    }
    
        public Student(String name, int age){
        this.name = name;
        this.age = age;
        this.grade = "not assigend";
    }
    
        public Student(String name, int age, String grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    
    void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Grade : " + grade);
    }
    
    
}

class Phone{
    public static void main(String[] args){
        Student student1 = new Student();
        Student student2 = new Student("sourav");
        Student student3 = new Student("sourav", 16);
        Student student4 = new Student("sourav", 16, "A+");
        
        System.out.println("Student 1 details :");
        student1.display();
        System.out.println("Student 2 details :");
        student2.display();
        System.out.println("Student 3 details :");
        student3.display();
        System.out.println("Student 4 details :");
        student4.display();
    }
}

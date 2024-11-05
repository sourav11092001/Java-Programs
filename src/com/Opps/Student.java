package com.Opps;

class Heart {
	double heartbeet;
	double weight;
	Heart(double heartbeet, double weight) {
		super();
		this.heartbeet = heartbeet;
		this.weight = weight;
	}
	public double getHeartbeet() {
		return heartbeet;
	}
	public double getWeight() {
		return weight;
	}	
}

class Brain {
	 double weight;
	 double iq;
	public Brain(double weight, double iq) {
		super();
		this.weight = weight;
		this.iq = iq;
	}
	public double getWeight() {
		return weight;
	}
	public double getIq() {
		return iq;
	}
}

class Mobile {
	String name;
	double price;
	public Mobile(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
}

class Bike {
	String name;
	double gear;
	public Bike(String name, double gear) {
		super();
		this.name = name;
		this.gear = gear;
	}
	public String getName() {
		return name;
	}
	public double getGear() {
		return gear;
	}
}

class Students {
	Heart h = new Heart(91.9, 10.0);
	Brain b = new Brain(22.2, 99.9);
	
	void hasMobile(Mobile m) {
		System.out.println(m.getName());
		System.out.println(m.getPrice());
	}
	
	void hasBike(Bike B) {
		System.out.println(B.getName());
		System.out.println(B.getGear());
	}
}


public class Student {

	public static void main(String[] args) {
		
		Students s = new Students();
		Bike bk = new Bike("honda", 5);
		Mobile mb = new Mobile("poco", 13000);
		
		System.out.println(s.h.getHeartbeet());
		System.out.println(s.h.getWeight());
		
		System.out.println(s.b.getWeight());
		System.out.println(s.b.getIq());
		
		s.hasMobile(mb);
		System.out.println("============================");
		
		System.out.println("without enclosing object");
		
//		s = null;
		
		System.out.println(mb.getName());
		System.out.println(mb.getPrice());
		
		System.out.println(s.h.getHeartbeet());
		System.out.println(s.h.getWeight());
		
		System.out.println(s.b.getWeight());
		System.out.println(s.b.getIq());
		
		s.hasBike(bk);
		System.out.println("===================================");
		
		System.out.println("without enclosing object");
		
//		s = null;
		
		System.out.println(bk.getName());
		System.out.println(bk.getGear());
		
		System.out.println(s.h.getHeartbeet());
		System.out.println(s.h.getWeight());
		
		System.out.println(s.b.getWeight());
		System.out.println(s.b.getIq());
		
	}

}

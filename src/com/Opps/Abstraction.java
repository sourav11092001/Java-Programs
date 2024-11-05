package com.Opps;

abstract class Plane{
	void takeOff(){
		System.out.println("plane is taking off");
	}
	abstract void fly();
	 void land(){
			System.out.println("plane is landing");
		}
}
class CargoPlane extends Plane{
	
	void fly() {
		System.out.println("cargoplane is flying");
	}
}
class PassengerPlane extends Plane{
	void fly() {
		System.out.println("passengerplane is flying");
	}
}
class FighterPlane extends Plane{
	void fly() {
		System.out.println("fighterplane is flying");
	}
}

class Airport{
	void permit(Plane ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}


public class Abstraction {

	public static void main(String[] args) {
		
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		Airport ap = new Airport();
//		Plane p = new Plane(); //error Cannot instantiate the type Plane
		ap.permit(cp);
		ap.permit(fp);
		ap.permit(pp);

	}

}

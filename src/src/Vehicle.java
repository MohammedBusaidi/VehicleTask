package src;

public class Vehicle extends Engine implements Honkable {
	public String make;
	public int model;
	public int year;
	public String color;
	public int numberOfWheels;
	public int weight;
	private int tint;
	public void start() {
		System.out.println("Vehicle Started");
	}
	public void stop() {
		System.out.println("Vehicle Stopped");
	}
	public void drive(double miles) {
		System.out.println("Vehicle driven " + miles + " miles");
	}
	public void honk() {
		System.out.println("Honk Honk!");
	}
	//Getter
		public int tint() {
			System.out.println("NO TINT");
			return tint;
		}
	//Setter
		public void setTint(int newTint) {
			this.tint = newTint;
		}
	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		
	}
		
}

class Car extends Vehicle {
	int noOfDoors;
	public void start() {
		System.out.println("Car Started");
	}
	public void stop() {
		System.out.println("Car Stopped");
	}
	public void drive(double miles) {
		System.out.println("Car driven " + miles + " miles");
	}
	public void honk() {
		System.out.println("Honk Honk!");
	}
	public void openTrunk() {
	    System.out.println("Trunk opened");
	  }
}

class Truck extends Vehicle {
	int numberOfAxles;	
	int capacityInTons;
	public void start() {
		System.out.println("Truck Started");
	}
	public void stop() {
		System.out.println("Truck Stopped");
	}
	public void drive(double miles) {
		System.out.println("Truck driven " + miles + " miles");
	}
	public void honk() {
		System.out.println("Honk Honk!");
	}
	public void load(int weightOfLoad) {
		System.out.println("Loaded" + weightOfLoad + "tons");
	}
}

class ElectricVehicle extends Vehicle {
	int batteryCapacity;
	int chargeLevel;
	public void charge(int increaseCharge) {
		chargeLevel = increaseCharge ++;
	}
	public void drive(double miles) {
		System.out.println("ElectricVehicle driven " + miles + " miles");
	}
}
abstract class Engine {
	abstract public void startEngine();
}

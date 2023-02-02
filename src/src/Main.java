package src;

public class Main {
	public static void main(String[] args) {
		Car newCar = new Car();
		Vehicle newVehicle = new Vehicle();
		Truck newTruck = new Truck();
		newCar.start();
		newTruck.start();
		newVehicle.start();
		newCar.drive(50);
		System.out.println(newCar.color = "red");
		newVehicle.tint();
		newCar.tint();
	}

}

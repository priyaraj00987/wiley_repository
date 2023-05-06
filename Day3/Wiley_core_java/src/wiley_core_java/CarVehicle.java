package wiley_core_java;

abstract class Vehicle{
	protected String color;
	protected int speed;
	protected int numWheels;
	
	public Vehicle(String color, int speed, int numWheels) {
		this.color = color;
		this.speed = speed;
		this.numWheels = numWheels;
	}
	
	public abstract void move();
}

class Car extends Vehicle{

	public Car(String color, int speed, int numWheels) {
		super(color, speed, numWheels);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void move() {
		System.out.println("Moving");
	}
	public void turn() {
		System.out.println("Turning");
	}
}

public class CarVehicle {
	public static void main(String[] args) {
		Car car = new Car("Blue", 150, 4);
		System.out.println(car.color+car.speed+car.numWheels);
	}
}

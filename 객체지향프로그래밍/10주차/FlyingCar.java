package test.case03;

public class FlyingCar implements Drivable, Flyable {
	public void drive() {
		System.out.println("I’m driving");
	}
	public void fly() {
		System.out.println("I’m flying");
	}
}
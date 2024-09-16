/*Write a Java program to create a class Vehicle with a method called speedUp(). Create two subclasses 
 * Car and Bicycle. Override the speedUp() method in each subclass to increase the vehicle's speed differently.*/  
package Polymorphism;

 class Vehicle {
	 private int speed;
	 
	//Method to get increase the speed by 10
	 public void speedUp() {
		speed+=10;
		
	}
	// Method to get the current speed of the vehicle
    public int getSpeed() {
        return speed;
    }
}
 
 class Car extends Vehicle{
	 @Override
	 public void speedUp() {
		// Call the speedUp method of the parent class (Vehicle)
		 super.speedUp();
		 System.out.println("Car Speed increased");
	 }
	 
 }
 
 class Motorcycle extends Vehicle{
	 @Override
	 public void speedUp() {
		// Call the speedUp method of the parent class (Vehicle)
		 super.speedUp();
		 System.out.println("Motorcycle Speed increased");
	 }
	 
 }
 
 
 
public class ProblemTwo {
	public static void main (String[] args) {
		Car car= new Car();
		Motorcycle motorcycle= new Motorcycle();
		System.out.println("Car Speed"+car.getSpeed());
		System.out.println("Motorcycle Speed"+motorcycle.getSpeed());
		car.speedUp();
		motorcycle.speedUp();
		System.out.println("\nCar speed after speeding up: " + car.getSpeed());
        System.out.println("Motorcycle speed after speeding up: " + motorcycle.getSpeed());
		
		
		
		
	}

}

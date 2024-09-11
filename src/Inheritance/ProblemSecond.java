/*Write a Java program to create a class called Vehicle with a method called drive(). 
 Create a subclass called Car that overrides the drive() method to print "Repairing a car".*/
package Inheritance;

   class Vehicle {
	   void drive() {
		   
	   }   
   }
   
   class Car extends Vehicle{
	   void drive() {
		   System.out.println("Repairing the car");
	   }
   }
   
public class ProblemSecond {
	public static void main(String[]args) {
		Vehicle vehicle=new Vehicle();
		Car car= new Car();
		car.drive();
	}

}

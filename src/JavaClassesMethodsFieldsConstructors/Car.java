package JavaClassesMethodsFieldsConstructors;

public class Car {

	// Static variable
	static int numberOfCars;

	// Instance variables
	String brand;
	int year;

	public Car(String brand, int year) {
		this.brand = brand;
		this.year = year;
		numberOfCars++;
	}

	public void display() {
		System.out.println("Brand: " + brand);
		System.out.println("Year: " + year);
	}

	public static void main(String[] args) {
		Car car1 = new Car("Toyota", 2022);
		Car car2 = new Car("Honda", 2017);
		car1.display();
		car2.display();
		System.out.println("Number of cars: " + Car.numberOfCars);
	}
}

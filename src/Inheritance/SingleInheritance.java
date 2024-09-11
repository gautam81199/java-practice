package Inheritance;

class Animall {
	public void eat() {
		System.out.println("Animal can eat");
	}

}

class Dog extends Animall {
	public void bark() {
		System.out.println("Dog can bark");
	}
}

public class SingleInheritance {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		dog.bark();

	}

}

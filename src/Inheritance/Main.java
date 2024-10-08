/*Write a Java program to create a class called Animal with a method called makeSound(). 
Create a subclass called Cat that overrides the makeSound() method to bark*/

package Inheritance;

class Animal {
	void makeSound() {
		System.out.println("The animals make sound");
	}
}

class Cat extends Animal {
	void makeSound() {
		System.out.println("The cat barks.");

	}
}

public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Cat cat = new Cat();
		animal.makeSound();
		cat.makeSound();

	}

}

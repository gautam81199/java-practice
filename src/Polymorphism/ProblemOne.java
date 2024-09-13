/*Write a Java program to create a base class Animal (Animal Family) with a method called Sound(). Create two 
 * subclasses Bird and Pig. Override the Sound() method in each subclass to make a specific sound for each 
 * animal.*/

package Polymorphism;

class Animal {
	void Sound() {
		System.out.println("The animal makes a sound");
	}

}

class Bird extends Animal {
	@Override
	public void Sound() {
		System.out.println("The bird chirps");
	}
}

class Pig extends Animal {
	@Override
	public void Sound() {
		System.out.println("The Pig sound");
	}

}

public class ProblemOne {
	public static void main(String[] args) {
		// Create an instance of Animal
		Animal animal = new Animal();
		// Create an instance of Bird
		Bird bird = new Bird();
		// Create an instance of Cat
		Pig pig = new Pig();

		// Call the Sound method on the Animal instance
		animal.Sound(); // Output: The animal makes a sound
		// Call the Sound method on the Bird instance
		bird.Sound(); // Output: The bird chirps
		// Call the Sound method on the Pig instance
		pig.Sound(); // Output: The Pig sound

	}

}

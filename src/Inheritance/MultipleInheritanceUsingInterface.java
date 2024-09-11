//Implement multiple inheritance in Java using interfaces.

package Inheritance;

//Define the Interfaces:
interface Animal1 {
	void eat();

}

interface Pet {
	void play();
}

//Implement the Interfaces in a Class
class Dog1 implements Animal1, Pet {

	public void eat() {
		System.out.println("The Dog Eats");
	}

	public void play() {
		System.out.println("The Dog plays");
	}

}

//Use the Class to Call the Methods
public class MultipleInheritanceUsingInterface {
	public static void main(String[] args) {
		Dog1 myDog = new Dog1();
		myDog.eat();
		myDog.play();
	}

}

package Abstraction;

abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void makeSound();
    
    // Regular method
    public void sleep() {
        System.out.println("Zzz...");
    }
}

class Dog extends Animal {
    // Providing implementation for the abstract method
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // Calls the abstract method
        myDog.sleep(); // Calls the regular method
    }
}


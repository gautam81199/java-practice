package Abstraction;

interface Animall {
    void makeSound(); // Abstract method
}

class Dogg implements Animall {
    // Providing implementation for the abstract method
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}

public class AbstractionUsingInterface {
    public static void main(String[] args) {
        Dogg myDog = new Dogg();
        myDog.makeSound(); // Calls the abstract method
    }
}


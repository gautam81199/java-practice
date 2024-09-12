package Inheritance;

class A {
	void show() {
		System.out.println("Show method in class A");
		}
}
class B extends A {
	void show() {
		System.out.println("Show method in class B");
	}
}

public class StaticDynamicBinding {
	public static void main(String[]args) {
		A a = new A();
		B b = new B();
		a.show();
		b.show();
		A obj = new B(); /*Creates an instance of class B but assigns it to a reference variable of type A. 
		                   This is an example of polymorphism.*/
		obj.show();
		
	}

}

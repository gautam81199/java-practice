package Inheritance;

class Fruits{
	void sweet() {
		System.out.println("Fruits are sweet");
	
	}
}

class Apple extends Fruits{
	void sweet() {
		System.out.println("Apple are sweeet");
		
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		Fruits fruit= new Fruits();
		fruit.sweet();
		Fruits MyApple = new Apple();
		MyApple.sweet();
		
	}

}

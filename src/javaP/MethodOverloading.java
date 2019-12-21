package javaP;

public class MethodOverloading {

	public MethodOverloading() {
		System.out.println("Noida");
	}
	
	
	public MethodOverloading(String s) {
		System.out.println(s);
	}
	
	public void method1(String s) {
		System.out.println("Java");
	}
	
	public void method1() {
		System.out.println("C#");
	}
	
	//public static void main(String[][] args) {
	//}
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.method1("Delhi");
	}
}


/*
If there are two or more methods with same name in same class then this is known as method overloading.
CONDITION: Parameter must be different in methods

*/
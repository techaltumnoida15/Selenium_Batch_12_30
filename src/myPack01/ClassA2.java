package myPack01;

public class ClassA2 extends ClassA1{

	public void methdo3() {
		System.out.println("ClassA2 - method3");
	}
	
	
	public void methdo4() {
		System.out.println("ClassA2 - method4");
	}
	
	public static void main(String[] args) {
		ClassA2 obj = new ClassA2();
		obj.methdo1();
	}
}

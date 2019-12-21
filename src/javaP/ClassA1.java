package javaP;

public class ClassA1 {

	int i = 10;
	String s = "Java";
	
	public void method1() {
		System.out.println("C#");
	}
	
	public void addNumbers() {
		int t = i + 10;
		System.out.println(t);
	}
	
	public void findOddEvenNumber() {
		
	}
	
	public void findPrimeNumber() {
		
	}
	
	
	static public void main(String[] abc) {
		ClassA1 obj = new ClassA1();
		
		obj.method1();
		obj.addNumbers();
		
		//new ClassA1().method1();   //Not a good Practice
		//new ClassA1().addNumbers();
	}
}

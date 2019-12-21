package javaP;

public class ClassA5 {

	public void method1(String s) {
		System.out.println(s);
		System.out.println("s");
	}
	
	public int addNumbers(int i, int j) {
		int t =  i + j;
		//System.out.println(t);
		
		return t;
		//return "Hi";
	}
	
	public void method3() {
		int result = addNumbers(4, 6);
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		ClassA5 obj = new ClassA5();
		//obj.method1("Java");
		
		obj.method3();
	}
}

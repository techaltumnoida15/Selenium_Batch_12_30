package javaP;

public class ClassA2 {

	int t = 10;                //int is an enum
	String s = "Selenium";     //String ia class
	
	public void method1() {
		
		//String s1 = Integer.toString(t);
		
		int stringLength = s.length();
		String revString = "";
		
		System.out.println("String lenghth is = " + stringLength);    //8
		
		char[] arr = s.toCharArray();
		
		for(int k = stringLength - 1; k>=0; k--) {
			 //System.out.println(arr[k]);
			 revString = revString + arr[k];
		}
		System.out.println(revString);
	}
	
	public static void main(String[] args) {
		ClassA2 obj = new ClassA2();
		obj.method1();
	}
}

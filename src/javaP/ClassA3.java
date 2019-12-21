package javaP;

import org.testng.annotations.Test;

public class ClassA3 {

	//@Test
	public void method1() {
		
		int i = 10;
		int j = 11;
		
		if(i*2 > 50) {
			System.out.println("I am in IF");
		}
		else {
			System.out.println("I am in else");
		}
	}
	
	public void method2() {
		
		int i = 2;
		int j = 3;
		
		//if((i*2 > 3*2) || (j > i) ) {
		//if((i*2 > 3*2) && (j > i) ) {
		//if((i*2 > 3*2) && (j > i) || (j > i)) {
		if((j > i) || (i*2 > 3*2) && (j > i)) {
			System.out.println("Hi");
		}
		else {
			System.out.println("Hello");
		}
	}

	public void method3() {
		//Loop - for
		/*
		 * for(int i = 0; i<=10; i++) { System.out.println(i); }
		 */
		
		for(int i = 10; i>=0; i--) {
			System.out.println(i);
		}
		
		//Array
	}
	
	public static void main(String[] args) {
		ClassA3 obj = new ClassA3();
		obj.method3();
	}
}

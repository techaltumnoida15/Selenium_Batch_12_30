package pack01;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public void setExample() {
		//Dec a set
		Set<String> mySet = new HashSet<String>();
		
		//mySet.get    //Set dont have .get()
		mySet.add("A");
		mySet.add("B");
		mySet.add("B");
		mySet.add("C");
		mySet.add("D");
		mySet.add("E");
		mySet.add("F");
		mySet.add("G");
		
		System.out.println(mySet);
		
		System.out.println(mySet.size());
		
	}
	
	public static void main(String[] args) {
		SetExample obj = new SetExample();
		obj.setExample();
	}
}

package pack01;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	
	public void listExample() {
		//Declare a list
		
		List<String> myList = new ArrayList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add("B");
		myList.add("C");
		myList.add("D");
		myList.add("E");
		myList.add("F");
		myList.add("G");
		/*myList.add(" ");
		
		 * myList.add("1"); myList.add("@");
		 */
		
		System.out.println(myList);
		
		//System.out.println(myList.get(2));
		
		//System.out.println(myList.isEmpty());
		
		//System.out.println(myList.remove(3));
		
		//System.out.println(myList);
		
		System.out.println(myList.size());
	}

	
	public static void main(String[] args) {
		ListExample obj = new ListExample();
		obj.listExample();
	}
}

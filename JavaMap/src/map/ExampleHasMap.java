package map;

import java.util.HashMap;

public class ExampleHasMap {

	public static void main(String[] args) {
		
		 HashMap<String, Integer> people = new HashMap<String, Integer>();
		 
		// Adding keys and values (Name, Age)
		    people.put("John", 32);
		    people.put("Steve", 30);
		    people.put("Anila", 33);

		    for (String i : people.keySet()) {
		      System.out.println("Name: " + i + " Age: " + people.get(i));
		    }

	}

}

package map;

import java.util.LinkedHashMap;

public class ExampleLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<String, String> people= new LinkedHashMap<String, String>();
		 
		// Adding keys and values (Name, Age)
		    people.put("John", "32");
		    people.put("Steve", "30");
		    people.put("Anila", "33");

		    for (String i : people.keySet()) {
		      System.out.println("Name: " + i + " Age: " + people.get(i));
		    }

	}

}

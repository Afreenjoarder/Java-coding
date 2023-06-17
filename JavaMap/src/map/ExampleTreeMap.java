package map;

import java.util.TreeMap;

public class ExampleTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> tree_map= new TreeMap<Integer, String>();
		 
		// Adding keys and values (Name, Age)
		tree_map.put(32, "John");
		tree_map.put(30,"Steve");
		tree_map.put(33,"Anila");

		    for (Integer i : tree_map.keySet()) {
		      System.out.println("Name: " + i + " Age: " + tree_map.get(i));
		    }

	}

}

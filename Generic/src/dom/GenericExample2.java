package dom;

import java.util.*;

public class GenericExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list=new ArrayList<Integer>(); 
		list.add(123);
		//list.add("qwer");
		
		
		List<Comparable> withoutgeneric = new ArrayList<Comparable>();
		withoutgeneric.add(123);
		withoutgeneric.add("generic");
		
		System.out.println(list);
		System.out.println(withoutgeneric);
}
}
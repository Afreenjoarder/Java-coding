package com;

import java.util.ArrayList;

public class LamdaExample {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
	    numbers.add(1);
	    numbers.add(2);
	    numbers.add(3);
	    numbers.add(4);
	    numbers.forEach(System.out::println );
	}

}

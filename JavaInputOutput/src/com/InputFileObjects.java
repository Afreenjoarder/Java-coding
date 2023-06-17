package com;

import java.util.Formatter;

public class InputFileObjects {

	public static void main(String[] args) {
	
		try {
			
			Formatter formatter=new Formatter("C:/Users/USER/Desktop/person/student.txt");
			
			formatter.format("%s %s\r\n","101", "Anis");
			formatter.format("%s %s\r\n","104", "Amin");
			
			formatter.close();
		}catch(Exception e) {
			System.out.print(e);
		}
		
	}

}

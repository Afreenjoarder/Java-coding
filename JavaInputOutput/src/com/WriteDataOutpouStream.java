package com;

import java.io.FileOutputStream;

public class WriteDataOutpouStream {

	public static void main(String[] args) {
		try {
			
			FileOutputStream fo= new FileOutputStream("C:/Users/USER/Desktop/person/student.txt");
			String s="Java Programming";
			byte b[]=s.getBytes();
			fo.write(b);
			fo.close();    
           System.out.println("success to add string in student.txt ...");

			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}

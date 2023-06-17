package com;

import java.io.FileInputStream;

public class ExampleInputStream {

	public static void main(String[] args) {
		try {
			
			FileInputStream io=new FileInputStream("C:/Users/USER/Desktop/person/student.txt");//Read data from the file
			int i=0;
			while((i=io.read())!=-1){    
				 System.out.print((char)i);    
			            }    

			   
			io.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}

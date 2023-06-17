package com;

import java.io.File;

public class WritetoFile {

	public static void main(String[] args) {
		File dir= new File("C:/Users/USER/Desktop/person");
		dir.mkdir();
		
		File file1=new File("C:/Users/USER/Desktop/person/student.txt");
		File file2=new File("C:/Users/USER/Desktop/person/java.txt");
		try {
			file1.createNewFile();
			file2.createNewFile();
			System.out.println("Files are created...");
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}

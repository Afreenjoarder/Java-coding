package com;

import java.io.File;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) {
		try {
			
			File file=new File("C:/Users/USER/Desktop/person/student.txt");
			Scanner sc=new Scanner(file);
			
			while(sc.hasNext()) {
				String Id=sc.next();
				String name=sc.next();
				System.out.println("ID  :"+Id + "   Name :"+name);
				
			}
			sc.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}

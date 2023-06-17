package com;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadDataConsole {

	public static void main(String[] args)  {
		
		readFile("C:/Users/USER/Desktop/person/student.txt");		
		
	
}
	private static void readFile(String fileName) {

        try (FileInputStream fis = new FileInputStream(new File(fileName))) {

            // remaining bytes that can be read
            //System.out.println("Remaining bytes that can be read : " + fis.available());

            int content;
            // reads a byte at a time, if end of the file, returns -1
            while ((content = fis.read()) != -1) {
                System.out.println((char) content);

               // System.out.println("Remaining bytes that can be read : " + fis.available());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
	

	}



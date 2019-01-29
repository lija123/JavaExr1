package org.jclass.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class TextRead {

	public static void main(String[] args) {
		File file = new File("data.txt");
		if(!file.exists()) {
			System.out.println(" does not exist.");
			return;
		}

		try {
			FileInputStream fis = new FileInputStream(file);
			char current;
			int count = 0;
			while (fis.available() > 0) 
			{
				current = (char) fis.read();
				if (current == 'a') 
				{
					count++;
				}
			
			}
			System.out.println(count);
			fis.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

	}

	

}

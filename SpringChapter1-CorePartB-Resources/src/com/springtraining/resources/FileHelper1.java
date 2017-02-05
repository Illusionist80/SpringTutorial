package com.springtraining.resources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHelper1 {

	public static void main(String[] args) throws IOException {
		
		//File file= new File("src/abc2.txt");
   
		//FileInputStream fis=new FileInputStream(file);
		BufferedReader br=new BufferedReader(new FileReader("src/abc2.txt"));
		String currentLine;
		
		while ((currentLine=br.readLine())!=null) {
			System.out.println(currentLine);
		}
		br.close();
	}

}

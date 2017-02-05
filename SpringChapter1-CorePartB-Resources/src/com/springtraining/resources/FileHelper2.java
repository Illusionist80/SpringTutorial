package com.springtraining.resources;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class FileHelper2 {

	public static void main(String[] args) throws IOException {

		new FileHelper2().getFileDetails();

	}

	public void getFileDetails() {

		InputStream is = getClass().getClassLoader()
				.getResourceAsStream("spring-annotationconfig.xml");

		Scanner sc1 = new Scanner(is);
		while (sc1.hasNext()) {

			System.out.println(sc1.nextLine());
		}

	}

}

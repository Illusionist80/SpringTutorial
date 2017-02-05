package com.springtraining.resources;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.mock.web.MockServletContext;
import org.springframework.web.context.support.ServletContextResource;

public class BasicSpringResourceSample {

	public static void main(String[] args) throws IOException {
		
		//Resource res=new ClassPathResource("abc2.txt");
		//Resource res=new FileSystemResource("src/abc2.txt");
		
		//Resource res=new UrlResource("file:///C:/Trainings/Spring3.0/Chapter1 - CORE/SpringWS/SpringChapter1-CorePartB-Resources/src/abc2.txt");
		//Resource res=new UrlResource("http://www.google.com");
		
		InputStream is=new ByteArrayInputStream("testbytesfromastring".getBytes());
		Resource res=new InputStreamResource(is,"bais");
		
		MockServletContext msc= new MockServletContext();
		Resource resWeb=new ServletContextResource(msc, "org/springframework/core/io/Resource.class");
		
		
		
		showFileContent(resWeb.getInputStream());
		
	}

	public static void showFileContent(InputStream is) {

		Scanner sc1 = new Scanner(is);
		while (sc1.hasNext()) {

			System.out.println(sc1.nextLine());
		}

	}

}

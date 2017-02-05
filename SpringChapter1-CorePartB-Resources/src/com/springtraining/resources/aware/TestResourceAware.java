package com.springtraining.resources.aware;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

public class TestResourceAware {

	public static void main(String[] args) throws IOException {
		
		//FileSystemXmlApplicationContext ac=new FileSystemXmlApplicationContext("classpath*:com/springtraining/resources/*/*-xsd*.xml");
		
		ClassPathXmlApplicationContext cpxac=new ClassPathXmlApplicationContext("beans-xsd.xml",PaymentService.class);
		
		//PaymentService paymentService= (PaymentService) cpxac.getBean("payment");
		
		ResourceInjection resourceInjection=(ResourceInjection) cpxac.getBean("injection");
		Resource resInj=resourceInjection.loadDyamicResources("remote");
		
		//Resource res=paymentService.getResource("abc2.txt");
		showFileContent(resInj.getInputStream());
		
	}
	public static void showFileContent(InputStream is) {

		Scanner sc1 = new Scanner(is);
		while (sc1.hasNext()) {

			System.out.println(sc1.nextLine());
		}

	}
}

package com.springtraining.beanref;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class BeanRefTestClient {

	public static void main(String[] args) {


		BeanFactory ctxStatic = new XmlBeanFactory(
		new ClassPathResource("com/springtraining/beanref/staticbeans.xml"));
		
		ConfigurableBeanFactory parent = new XmlBeanFactory(
				new ClassPathResource("com/springtraining/beanref/projectConfig.xml"),ctxStatic);

		ConfigurableBeanFactory child = new XmlBeanFactory(
				new ClassPathResource("com/springtraining/beanref/childConfig.xml"));

		child.setParentBeanFactory(parent);
		
		Payment pmt = (Payment) child.getBean("pmnt");
		pmt.pay();
	}

}

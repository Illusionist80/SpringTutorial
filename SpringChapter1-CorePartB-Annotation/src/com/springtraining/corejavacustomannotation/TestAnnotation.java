package com.springtraining.corejavacustomannotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestAnnotation {

	/**
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws SecurityException
	 */
	public static void main(String[] args) throws SecurityException,
			ClassNotFoundException {
		for (Method method : Class.forName(
				"com.springtraining.corejavacustomannotation.BuildHouse")
				.getMethods()) {
			if (method.isAnnotationPresent(Developer.class)) {
				System.out.println(method);

				for (Annotation anno : method.getAnnotations()) {
					// System.out.println(anno);
					Developer dev = method.getAnnotation(Developer.class);
					// System.out.println(dev.value());
					if (dev.value().equals("Parag")) {
						System.out
								.println("Parag is the coder..Apply more quality checks!");
					}
				}
			}
		}

	}

}

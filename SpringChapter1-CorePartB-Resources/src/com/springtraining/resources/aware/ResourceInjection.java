package com.springtraining.resources.aware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class ResourceInjection {
	@Autowired
	private ResourceLoader resourceLoader;

	private Resource textFile;

	public ResourceLoader getResourceLoader() {
		return resourceLoader;
	}

	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}

	public Resource getTextFile() {
		return textFile;
	}

	public void setTextFile(Resource textFile) {
		this.textFile = textFile;
	}

	public Resource loadDyamicResources(String decision) {

		
		if (decision.equals("local")) {
			return resourceLoader.getResource("com/springtraining/resources/abc1.txt");
		} else {

			return resourceLoader.getResource("abc2.txt");
		}
	}

}

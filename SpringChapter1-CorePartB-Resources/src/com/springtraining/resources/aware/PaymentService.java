package com.springtraining.resources.aware;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class PaymentService implements ResourceLoaderAware{

	private ResourceLoader resourceLoader;
	
	@Override
	public void setResourceLoader(ResourceLoader arg0) {
		this.resourceLoader=arg0;
	}

	public Resource getResource(String location) {
		return resourceLoader.getResource(location);
	}

}

package com.springtraining.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloWorldController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
 HttpServletResponse response) throws Exception {

		ModelAndView model = new ModelAndView("HelloWorldPage");//JSP NAME
		model.addObject("msg", "Welcome beginner!");

		return model;
//http://localhost:8080/SpringMVC/welcome.sf is requested.
//
// URL has “.htm” extension, so it will redirect to “DispatcherServlet” 
// and send request to the default BeanNameUrlHandlerMapping.
//
// BeanNameUrlHandlerMapping returns HelloWorldController to the DispatcherServlet.
//
// DispatcherServlet forward requests to the HelloWorldController.
//
// HelloWorldController processes it and returns a ModelAndView object named “HelloWorldPage”.
//
// DispatcherServlet receives the ModelAndView and calls the viewResolver to process it.
//
// viewResolver returns the “/WEB-INF/pages/HelloWorldPage.jsp” back to the DispatcherServlet.
//
// DispatcherServlet return the “HelloWorldPage.jsp” back to user.		
	}

}
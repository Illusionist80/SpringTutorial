http://localhost:8080/SpringMVC/welcome.htm is requested.

URL has “.htm” extension, so it will redirect to “DispatcherServlet” and send request to the default BeanNameUrlHandlerMapping.

BeanNameUrlHandlerMapping returns HelloWorldController to the DispatcherServlet.

DispatcherServlet forward requests to the HelloWorldController.

HelloWorldController processes it and returns a ModelAndView object named “HelloWorldPage”.

DispatcherServlet receives the ModelAndView and calls the viewResolver to process it.

viewResolver returns the “/WEB-INF/pages/HelloWorldPage.jsp” back to the DispatcherServlet.

DispatcherServlet return the “HelloWorldPage.jsp” back to user.
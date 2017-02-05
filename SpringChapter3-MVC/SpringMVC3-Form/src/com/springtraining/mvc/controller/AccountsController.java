package com.springtraining.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springtraining.mvc.bean.Logon;

@Controller
public class AccountsController {

	@RequestMapping(value = "/home.sf", method = RequestMethod.GET)
	public String mainWelcome(ModelMap model) {
		model.addAttribute("message", "Welcome!");
		return "home";
	}

	@RequestMapping(value = "/logon", method = {RequestMethod.GET , RequestMethod.POST})
	public ModelAndView logon(ModelMap model) {
		System.out.println(model);
		// we have passed a blank Logon object in the ModelAndView object with
		// name "logon" because the spring framework expects an object with
		// name "command" if you are using <form:form> tags in your JSP file. So
		// when Logon() method is called it returns login.jsp view.
		return new ModelAndView("login", "command", new Logon());
	}

	@RequestMapping(value = "/checkLogon", method =  RequestMethod.POST)
	public String validateLogon(Logon logon, ModelMap model) {
		System.out.println(logon);
		
		if((logon.getUserId()+"111").equals(logon.getPassword()))
		{
		model.addAttribute("message", "logon worked for : "+ logon.getUserId());
		return "securepage";
		}else{
			model.addAttribute("message", "Logon error...please retry");
			//return "home";
			return "redirect:logon";
		}
	}

}

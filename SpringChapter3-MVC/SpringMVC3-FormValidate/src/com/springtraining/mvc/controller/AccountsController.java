package com.springtraining.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import com.springtraining.mvc.bean.Logon;
import com.springtraining.mvc.validator.LogonValidator;

@Controller
public class AccountsController {

	LogonValidator logonValidator;
	
	@Autowired
	public AccountsController(LogonValidator logonValidator){
		this.logonValidator = logonValidator;
	}
	
	
	@RequestMapping(value = "/home.sf", method = RequestMethod.GET)
	public String mainWelcome(ModelMap model) {
		model.addAttribute("message", "Welcome!");
		return "home";
	}

	@RequestMapping(value = "/logon.sf", method = RequestMethod.POST)
	public String logonMethod(
			@ModelAttribute("logon") Logon logon,
			BindingResult result, SessionStatus status) {
		
		logonValidator.validate(logon, result);
		
		if (result.hasErrors()) {
			//if validator failed
			return "login";
		} else {
			status.setComplete();
			//form success
			return "securepage";
		}
	}
	@RequestMapping(value = "/logon.sf", method = RequestMethod.GET)
	public String initForm(ModelMap model){
		
		Logon logon = new Logon();
		
		//command object
		model.addAttribute("logon", logon);
		
		//return form view
		return "login";
	}
	
}

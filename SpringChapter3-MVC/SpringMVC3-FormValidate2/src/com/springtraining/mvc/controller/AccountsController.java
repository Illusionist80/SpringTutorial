package com.springtraining.mvc.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

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
		return "home";//"redirect:logon.sf"
	}
	
	@RequestMapping(value = "/logon.sf", method = RequestMethod.POST)
      public String loginJSR303Check(@Valid Logon logon, BindingResult result, ModelMap model) {
		
		logonValidator.validate(logon, result);
		
          if (result.hasErrors()) {
  			//if validator failed
  			return "login";
          } else {
              model.addAttribute("logon", logon);
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
	
	@ModelAttribute("roleList")
	protected Map populateRoleRefData(HttpServletRequest request) throws Exception {
		
		//Data referencing for role dropdown box
		Map<String,String> roles = new LinkedHashMap<String,String>();
		roles.put("Admin", "Administrator");
		roles.put("Developer", "Developer");
		roles.put("User", "User");
		
		return roles;
	}
	
}

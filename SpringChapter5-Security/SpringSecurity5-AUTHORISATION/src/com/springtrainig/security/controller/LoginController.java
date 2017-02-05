package com.springtrainig.security.controller;
 
import java.security.Principal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class LoginController {
 
	@RequestMapping(value="/welcome", method = RequestMethod.GET)
	public String printWelcome(ModelMap model, Principal principal ) {
		
		System.out.println("***********LoginController printWelcome() Called***********");
 
		String name = principal.getName();
		model.addAttribute("username", name);
		model.addAttribute("message", "Spring Security authorisation example");
		return "hello";
 
	}
	
	@RequestMapping(value="/admin", method = RequestMethod.GET)
	public String handleAdmin(ModelMap model, Principal principal ) {
		
		System.out.println("***********LoginController handleAdmin Called***********");
 
		String name = principal.getName();
		model.addAttribute("username", name);
		model.addAttribute("message", "This is admin area");
		return "admin";
	}
	
 
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(ModelMap model) {
		System.out.println("***********LoginController login() Called***********");
		return "login";
 
	}
	
	@RequestMapping(value="/loginfailed", method = RequestMethod.GET)
	public String loginerror(ModelMap model) {
		System.out.println("***********LoginController loginerror() Called***********");
		model.addAttribute("error", "true");
		return "login";
 
	}
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(ModelMap model) {
		System.out.println("***********LoginController logout() Called***********");
		return "login";
 
	}
	@RequestMapping(value="/*", method = RequestMethod.GET)
	public String home(ModelMap model) {
		System.out.println("***********LoginController home() Called***********");
		return "home";
 
	}
	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public String accessDenied(ModelMap model) {
		return "403";
	}
}
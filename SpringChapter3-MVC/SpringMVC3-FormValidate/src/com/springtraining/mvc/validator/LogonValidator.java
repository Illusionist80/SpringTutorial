package com.springtraining.mvc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.springtraining.mvc.bean.Logon;

public class LogonValidator implements Validator{
 
	@Override
	public boolean supports(Class clazz) {
		//just validate the Customer instances
		return Logon.class.isAssignableFrom(clazz);
	}
 
	@Override
	public void validate(Object target, Errors errors) {
		System.out.println("validate(Object target, Errors errors) ");
		
		System.out.println(target);
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userId",
			"required.userName", "Field name is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password",
			"required.password", "Field name is required.");
		
		System.out.println("validate() : - "+errors);
		
		Logon logon = (Logon)target;
		if(logon.getPassword()!=null && !(logon.getPassword().equals(logon.getUserId()+"111"))){
			errors.rejectValue("password", "invalid.logon");
			System.out.println("rejected");
		}
		}
}

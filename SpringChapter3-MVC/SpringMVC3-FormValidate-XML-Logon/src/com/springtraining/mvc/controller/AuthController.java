package com.springtraining.mvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.springtraining.mvc.bean.Logon;

public class AuthController extends SimpleFormController {

	public AuthController() {
		setCommandClass(Logon.class);
		setCommandName("loginForm");
	}

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {

		Logon logon = (Logon) command;
		System.out.println(logon);
		return new ModelAndView("securepage", "loginBean", logon);

	}

	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {

		Logon logon = new Logon();

		return logon;
	}

	@Override
	protected Map referenceData(HttpServletRequest request) throws Exception {

		Map referenceData = new HashMap();

		// Data referencing for role dropdown box
		Map<String, String> roles = new LinkedHashMap<String, String>();
		roles.put("Admin", "Administrator");
		roles.put("Developer", "Developer");
		roles.put("User", "User");
		referenceData.put("roleList", roles);

		// Data referencing for days dropdown box
		List dayList = new ArrayList();
		dayList.add("1");
		dayList.add("5");
		dayList.add("10");
		referenceData.put("dayList", dayList);

		return referenceData;
	}
}
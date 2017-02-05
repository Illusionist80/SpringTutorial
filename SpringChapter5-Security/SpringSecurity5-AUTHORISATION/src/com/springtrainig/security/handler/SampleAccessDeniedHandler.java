package com.springtrainig.security.handler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

public class SampleAccessDeniedHandler implements AccessDeniedHandler {
	private String accessDeniedUrl;

	public SampleAccessDeniedHandler() {
	}

	public SampleAccessDeniedHandler(String accessDeniedUrl) {
		this.accessDeniedUrl = accessDeniedUrl;
	}

	public void handle(HttpServletRequest request,
			HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException,
			ServletException {

		response.sendRedirect(accessDeniedUrl);
		request.getSession().setAttribute("message",
				"You do not have permission to access this page!");

	}

	public String getAccessDeniedUrl() {
		return accessDeniedUrl;
	}

	public void setAccessDeniedUrl(String accessDeniedUrl) {
		this.accessDeniedUrl = accessDeniedUrl;
	}
}
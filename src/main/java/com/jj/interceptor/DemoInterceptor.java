package com.jj.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


public class DemoInterceptor implements HandlerInterceptor{

	
	private final Logger logger = LoggerFactory.getLogger(HandlerInterceptor.class);

	public boolean preHandle(HttpServletRequest request, 
							 HttpServletResponse response, Object handler) throws Exception {

		String username = (String) request.getSession().getAttribute("username");
		if (StringUtils.isBlank(username)) {
			logger.info("user not login");
			response.sendRedirect(request.getContextPath());
			return false;
		}
		logger.info("user has login");
		return true;
	}
	
	
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {		
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler, ModelAndView modelAndView)
			throws Exception {		
	}

	
}

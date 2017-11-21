package com.jj.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


public class DemoInterceptor implements HandlerInterceptor{


	public boolean preHandle(HttpServletRequest request, 
							 HttpServletResponse response, Object handler) throws Exception {

		String username = (String) request.getSession().getAttribute("username");
		if (StringUtils.isBlank(username)) {
			response.sendRedirect(request.getContextPath());
			return false;
		}
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

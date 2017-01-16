package com.revature.lms.initiliazers;

import org.apache.catalina.servlets.DefaultServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.revature.lms.config.WebMvcConfig;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
	
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { WebMvcConfig.class, DefaultServlet.class,DefaultServlet.class };
	}

	@Override
	protected String[] getServletMappings() {
	
		return new String[] { "/",".css",".js" };
	}

}

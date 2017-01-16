package com.revature.lms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.revature.lms"})
public class WebMvcConfig extends WebMvcConfigurerAdapter{
	
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }


	 @Bean
	    public InternalResourceViewResolver getInternalResourceViewResolver() {
	        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	       
	        resolver.setPrefix("/WEB-INF/views/");
	        resolver.setSuffix(".jsp");
	        return resolver;
	    }
}

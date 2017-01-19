package com.revature.lms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	@RequestMapping(value={"/","/home"})
	public String showHome()
	
	{
		
		return "/views/index.htm";
	}
	@RequestMapping("/holidays")
	public String showHolidays()
	{
		return "/views/holidays.htm";
	}
	@RequestMapping("/history")
	public String showLeaveHistory()
	{
		return "/views/leavehistory.htm";
	}
	@RequestMapping("/cancel")
	public String showLeaveCancel()
	{
		return "/views/leavehistory.htm?cancel=true";
	}
	

}

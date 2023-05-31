package com.spring.mvc.controller;

import java.time.LocalDateTime;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import springmvc1.User1;

@Controller
public class HomeController {
	
	@RequestMapping("/about")
	@ResponseBody
	public String about(Model model) {
			System.out.println("this is about url");
			model.addAttribute("name","priya raj");
			model.addAttribute("id", "1");
		return "about";
		}
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help controller");
		ModelAndView modelAndView=new ModelAndView();
		
		modelAndView.addObject("name","priyaa raj");
		modelAndView.setViewName("help");
		LocalDateTime now= LocalDateTime.now();
		modelAndView.addObject("time",now);
		
				return modelAndView ;
		
	}
	@RequestMapping(value="/form",method=RequestMethod.GET)
	
	public ModelAndView showRegistrationPage() {
		System.out.println("this is form controller");
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("form");
				return modelAndView ;
		
	}
	@RequestMapping(value="/registerUser",method=RequestMethod.GET)
	public ModelAndView registerUser(@ModelAttribute("user")User1 user) {
		System.out.println("hiiiii");
		ModelAndView modelAndView=new ModelAndView();
	//modelAndView.setViewName("form");
		modelAndView.addObject("user",user);
		modelAndView.setViewName("regResult");
				return modelAndView ;
		
	}
}
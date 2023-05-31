package com.newspringmvc;



import java.sql.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.newspringmvc.entities.Todo;

@Controller
public class HomeController {
	@RequestMapping("/home")
public String home(Model m) {
		String str="Home";
		m.addAttribute("name", str);
	return "home";
	
}
	@RequestMapping("/add")
public String home2(Model m) {
		Todo t= new Todo();
		m.addAttribute("name", "add");
		m.addAttribute("todo",t);
		
		//String str="Home";
		
	return "home";
	
}
	@RequestMapping(value="/saveTodo",method=RequestMethod.POST)
	public String saveTodo(@ModelAttribute("todo" )Todo t ,Model m) {

System.out.println(t);
		
		return "home";
	}
}

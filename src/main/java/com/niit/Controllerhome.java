package com.niit;
 import org.springframework.stereotype.Controller;
 import org.springframework.ui.Model;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RequestMethod;

 

@Controller
public class Controllerhome {
	
	@RequestMapping("/")
	public String showlandingpage()
	{
		return "index";
	}
   @RequestMapping(value="/login",method=RequestMethod.GET)
public String end(Model model)
{
	model.addAttribute("vikas", "Welcome to Spring Framework");
	return "end";
}
}




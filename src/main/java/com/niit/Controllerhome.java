package com.niit;
 import org.springframework.stereotype.Controller;
 import org.springframework.ui.Model;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RequestMethod;

 

@Controller
public class Controllerhome {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String showlandingpage()
	{
		return "wellcome";
	}
   @RequestMapping(value="/lost",method=RequestMethod.GET)
public String showwelcome(Model model)
{
	model.addAttribute("vikas", "Welcome to Spring Framework");
	return "end";
}
}




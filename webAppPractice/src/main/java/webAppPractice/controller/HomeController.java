package webAppPractice.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/homeController")
public class HomeController {
	
	
	//This method is not working 
	@RequestMapping(path = "/myHome" , method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("This is Home url");
		model.addAttribute("name", "Vatsal");
		return "index";
	}
	//This method is not working 
	@RequestMapping("/about")
	public ModelAndView about( ) {
		ModelAndView md = new ModelAndView();
		md.addObject("name", "Deepak");
		md.setViewName("about");
		return md;
	}
	
	@RequestMapping( path = "processForm" , method = RequestMethod.POST)
	public String processForm(@RequestParam("userName") String name , @RequestParam("password") String password, Model mod) {
		
		
		System.out.println("The name is  = " + name + " the password is  = " + password);
		mod.addAttribute("name",name);
		mod.addAttribute("password",password);
		
		return "success";
		}
}

package webAppPractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
	//This mehtod is not working 
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is Home url");
		model.addAttribute("name", "Vatsal");
		return "index";
	}
	
	

	//This mehtod is not working 
	@RequestMapping("about")
	public ModelAndView about( ) {
		ModelAndView md = new ModelAndView();
		md.addObject("name", "Deepak");
		md.setViewName("about");
		return md;
		
	}

}

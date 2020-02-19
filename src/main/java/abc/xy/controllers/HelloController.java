package abc.xy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import abc.xy.models.Customer;

@Controller
public class HelloController {
	
	@RequestMapping(value="/hello", method = RequestMethod.GET )
	public ModelAndView showHelloPage() {
		System.out.println("i am coming from hello");
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("hello-page");
		mv.addObject("location", "Fairfax, Virginia");
		
		Customer c = new Customer();
		c.setName("abinash");
		c.setEmail("abinash@gmail.com");
		
		mv.addObject("loggedInCustomer", c);
		
		return mv;
	}

}

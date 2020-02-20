package abc.xy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import abc.xy.db.ImMemoryCustomerDb;
import abc.xy.models.Customer;
import abc.xy.services.CustomerService;

@Controller
@RequestMapping("customer")
public class CustomerController {

	private CustomerService cs;

	@RequestMapping(value = "/details", method = RequestMethod.GET)
	public ModelAndView showCustomer(@RequestParam String id) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("customer");

		Customer c = cs.getCustomerById(id);
		mv.addObject("customer", c);

		return mv;
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView showCustomerForm(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("create-customer");
		
		Customer c = new Customer();
		mv.addObject("custFormObj", c);
		return mv;
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public String processSignup(Customer cust){
		System.out.println(cust.toString());
		return "welcome";
	}
	

	public CustomerService getCs() {
		return cs;
	}

	public void setCs(CustomerService cs) {
		this.cs = cs;
	}

}

package abc.xy.db;

import java.util.HashMap;
import java.util.Map;

import abc.xy.models.Customer;

public class ImMemoryCustomerDb {
	
	
	public static Map<String, Customer> customerTable = new HashMap<String, Customer>();
	
	static {
		Customer c1 = new Customer();
		c1.setId("10");
		c1.setEmail("abinash@gmail.com");
		c1.setName("Abinash");
		
		Customer c2 = new Customer();
		c2.setId("11");
		c2.setEmail("asd@gmail.com");
		c2.setName("Random 1");
		
		Customer c3 = new Customer();
		c3.setId("12");
		c3.setEmail("dfasd@gmail.com");
		c3.setName("Randasdfasom 1");
		
		customerTable.put("10", c1);
		customerTable.put("11", c2);
		customerTable.put("12", c3);
	}

}

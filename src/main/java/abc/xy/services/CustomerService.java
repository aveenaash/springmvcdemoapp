package abc.xy.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import abc.xy.db.DbUtility;
import abc.xy.db.ImMemoryCustomerDb;
import abc.xy.models.Customer;

public class CustomerService {

	public Customer getCustomerById(String id) throws Exception {
		// return ImMemoryCustomerDb.customerTable.get(id);

		Connection con = DbUtility.getConnection();

		Statement stmt = con.createStatement();

		String sql = "select * from customers where id = " + id;

		ResultSet rs = stmt.executeQuery(sql);
		Customer c = new Customer();
		
		while (rs.next()) {
			int custId = rs.getInt("id");
			c.setId(custId +"");
			c.setName(rs.getString("name"));
			c.setEmail(rs.getString("email"));
		}
		
		return c;
	}
	
	
}

package org.ncu.practiceapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step 2
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ewa_ncu","Shreya","sg@07022003");
		//step 3
		Statement stmt = con.createStatement();
		//step 4
		/*String query = "CREATE TABLE employee(id INT(10) , emp_name VARCHAR(50) ,  emp_sal INTEGER(10), PRIMARY KEY(id) )";
		int result = stmt.executeUpdate(query);
		if(result == 1) { 
			System.out.println("Operation failed!!!"); 
		}
		else {
			System.out.println("Table created successfully");
		}*/
		String query2 = "INSERT into employee VALUES(105, 'Avnee' , 10000 ),"+"(104,'Ritika',2000),"+"(102,'Aloo', 100),"+"(103,'Kaushal',230)";
		if(stmt.executeUpdate(query2)==1) {
			System.out.println("insertion failed");
		}
		else {
			System.out.println("data successfully entered");
		}
		// show the output in java
		String query3 = "SELECT * from employee";
		ResultSet res = stmt.executeQuery(query3);
		while(res.next()) {
			int id = res.getInt("id");
			String name = res.getString("emp_name");
			int salary = res.getInt("emp_sal");
			System.out.println("Id: " + id + " Name: " + name + " salary: " + salary );
		}
		System.out.println("operation completed successfully");
		stmt.close();
		con.close();
		
	}

}

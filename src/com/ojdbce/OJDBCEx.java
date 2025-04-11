package com.ojdbce;
import java.sql.*;
		public class OJDBCEx {
			public static void main(String[] args) throws Exception {

				// TODO Auto-generated method stub

				String driver ="oracle.jdbc.OracleDriver";
				String url = "jdbc:oracle:thin:@localhost:1521/XE";
				String username = "SYSTEM";
				String password = "root";

				//step 1: Register the driver
				Class.forName(driver);

				//Step 2 get the connection
					Connection con = DriverManager.getConnection(url,username,password);

					 System.out.println("Connected to the database!");
					 		            
					//step 3: create the statement object
					Statement stmt = con.createStatement();

					//step 4: execute the querie


					stmt.executeUpdate("insert into student values(1,'Babu')");
					stmt.executeUpdate("insert into student values(2,'Praveen')");
					stmt.executeUpdate("insert into student values(3,'Narni')");
					//stmt.executeUpdate("insert into student values(1, 'Babu')");


					 //scanner.close();
					 //statement.close();

					//step 5: close the conncetion
					con.close();
	}

}

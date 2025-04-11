package com.ojdbce;
import java.sql.*;
import java.util.Scanner;
		public class OJDBCEx {
			public static void main(String[] args) throws Exception {

				// TODO Auto-generated method stub

				String driver ="oracle.jdbc.OracleDriver";
				String url = "jdbc:oracle:thin:@localhost:1521/XE";
				String username = "SYSTEM";
				String password = "root";

				Scanner scn = new Scanner(System.in);
				
				//step 1: Register the driver
				Class.forName(driver);

				//Step 2 get the connection
					Connection con = DriverManager.getConnection(url,username,password);

					 System.out.println("Connected to the database!");
					 
					 
					 String sql="insert into student(ID,name) VALUES (?,?)";
					 PreparedStatement pstmt=con.prepareStatement(sql);
					 
					 System.out.print("Enter your ID: ");
					 int ID= scn.nextInt();
					 scn.nextLine();
					 
					 System.out.println("Enter your Name: ");
					 String name=scn.nextLine();
					 
					 pstmt.setInt(1,ID);
					 pstmt.setString(2,name);
					 
					 int rowsInserted = pstmt.executeUpdate();
					 if (rowsInserted >0) {System.out.println("Data Saved!");}
					 		            
					//step 3: create the statement object
					//Statement stmt = con.createStatement();

					//step 4: execute the querie

/*
					stmt.executeUpdate("insert into student values(1,'Babu')");
					stmt.executeUpdate("insert into student values(2,'Praveen')");
					stmt.executeUpdate("insert into student values(3,'Narni')");
					//stmt.executeUpdate("insert into student values(1, 'Babu')");

*/
					 scn.close();
					 //statement.close();
pstmt.close();
					//step 5: close the conncetion
					con.close();
	}

}

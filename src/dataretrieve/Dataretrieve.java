package dataretrieve;

import java.sql.*;

public class Dataretrieve {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//1.Register the driver
		Class.forName("oracle.jdbc.OracleDriver");
		
		//2.Establish connection
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","SYSTEM","root");
		
		//3.Create Statement Object
		Statement stmt =conn.createStatement();
		
		//4.Execute Query
		ResultSet res= stmt.executeQuery("SELECT * from student");
		
		while(res.next()) {
			System.out.print(res.getInt(1)+"     ");
			System.out.println(res.getString(2));
		}
		
		
		//5.Close Statement Object
		stmt.close();
		
	}

}

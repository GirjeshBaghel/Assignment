package JDBC_Program;

import java.sql.*;

public class CP {
	static Connection con;
	public static Connection createC() throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/student_manager";
		String user = "root";
		String pass = "12345";
		con = DriverManager.getConnection(url,user,pass);
		return con;
	}
}

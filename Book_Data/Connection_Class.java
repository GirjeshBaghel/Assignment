package Books;

import java.sql.*;

public class Connection_Class {
	static Connection con;
	public static Connection createC() throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/books";
		String user = "root";
		String pass = "12345";
		con = DriverManager.getConnection(url,user,pass);
		return con;
	}
}

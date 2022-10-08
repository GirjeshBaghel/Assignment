import java.sql.*;

public class Connect {
	
	  static Connection con; 
	  public static Connection create() throws Exception 
	  {
			String url = "jdbc:mysql://localhost:3306/login_form";
			String user = "root";
			String pass = "12345";
		  con = DriverManager.getConnection(url,user,pass);
		  return con; 
	  }
	
	}


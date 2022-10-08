

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class First
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
  

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		/*out.println("Connected");
		String u_name = request.getParameter("email1");
	  	String u_pass = request.getParameter("pass");
	  	 out.print("name="+u_name+"And pass="+u_pass);*/
	try {
		Connection con = Connect.create(); 
	  	String q = "select * from form2 where u_email=? and u_pass=?";
	  	String u_email = request.getParameter("email1");
	  	String u_pass = request.getParameter("pass1");
	  	
		System.out.println("After Connection");
		PreparedStatement ps =  con.prepareStatement(q);
		ps.setString(1, u_email);
		ps.setString(2, u_pass);
		ResultSet rs = ps.executeQuery();		
		if(rs.next())
		{
			RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("Incorrect1.jsp");
			rd.forward(request, response);
			
			
		
		}
		ps.close();
		con.close();
		
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		
	
		
	}

}

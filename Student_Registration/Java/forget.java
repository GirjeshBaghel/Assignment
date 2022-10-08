import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/forget")
public class forget extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		try {
			Connection con = Connect.create();
			String email = request.getParameter("email");
			String pass = request.getParameter("pass");	
			out.println("Email :"+email);
			out.println("pass : "+pass);
		String q = "update  form2 set u_pass=? where u_email=?";
		PreparedStatement ps = con.prepareStatement(q);
		ps.setString(1, pass);
		ps.setString(2, email);
		ps.executeUpdate();
		ps.close();
		con.close();
		RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
		rd.forward(request, response);
		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

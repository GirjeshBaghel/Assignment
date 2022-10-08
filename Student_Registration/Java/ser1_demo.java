import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ser1_demo
 */
@WebServlet("/ser1_demo")
public class ser1_demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
		protected  void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			//out.println("<h1>Login Form Output is here..</h1>");
			System.out.println("Connected Successfully..");
			
			String id = req.getParameter("id");
			String name = req.getParameter("name");
			String password = req.getParameter("password");
			String email = req.getParameter("email");
			String gender = req.getParameter("gender");
			String cources = req.getParameter("cource");
		//	String con = req.getParameter("condition");
			
			Student_Data sd = new Student_Data(id,name,password,email,gender,cources);
			try {
				StudentDao.addStudent(sd);
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			

	}

}

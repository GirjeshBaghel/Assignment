import java.sql.*;

public class StudentDao  {

	public static void addStudent(Student_Data sd) throws Exception {
			
		Connection con = Connect.create();
		String q = "insert into form1(s_id,s_name,s_pass,s_email,s_gender,s_cource)values(?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(q);
		ps.setString(1, sd.getId());
		ps.setString(2, sd.getName());
		ps.setString(3, sd.getPassword());
		ps.setString(4, sd.getEmail());
		ps.setString(5, sd.getGender());
		ps.setString(6, sd.getCources());
		ps.executeUpdate();
		ps.close();
		con.close();
		
		
		
	}

	
	
}

package JDBC_Program;

import java.sql.*;

public class StudentDao {

	public static boolean insertStudentToDB(Student st) throws Exception 
	{
		boolean f = false;
		Connection con = CP.createC();
		String q = "insert into student(s_name,s_ph,s_city)values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(q);
		ps.setString(1, st.getStudentName());
		ps.setString(2, st.getStudentPhone());
		ps.setString(3, st.getStudentCity());
		ps.executeUpdate();
		f=true;
		return f;
				
	}

	public static boolean deleteStudentToDB(int d_id)  throws Exception{
		boolean f = false;
		Connection con = CP.createC();
		String q = "delete from student where s_id=?";
		PreparedStatement ps = con.prepareStatement(q);
		ps.setInt(1, d_id);
		ps.executeUpdate();
		f=true;
		return f;
		
	}
	
	public static void showAllStudent()  throws Exception{
		Connection con = CP.createC();
		String q = "select * from student";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(q);
		System.out.println("Id\t\tName\t\tPhone\t\tCity");
		while(rs.next())
		{
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String phone = rs.getString(3);
			String city = rs.getString(4);
			 System.out.print(rs.getInt(1));
	           System.out.print("\t\t"+rs.getString(2));
	           System.out.print("\t\t"+rs.getString(3));
	           System.out.print("\t"+rs.getString(4));
	           System.out.println();
		}
		
	}

	public static void updateStudent() throws Exception 
	{
		Connection con = CP.createC();
		System.out.println("Enter Student Id : ");
		int u_id ;
		String q = "update table student set s_name=? where s_id=?";
		PreparedStatement ps = con.prepareStatement(q);
		//ps.setInt(1, u_id);
		ps.executeUpdate();
		
	}

}

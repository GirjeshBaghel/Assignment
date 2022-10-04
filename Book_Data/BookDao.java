package Books;

import java.sql.*;
import com.mysql.cj.xdevapi.Result;
import JDBC_Program.Student;
public class BookDao {
	
	public static boolean addbookDao(Book_Data st) throws Exception 
	{
		boolean f = false;
		Connection con = Connection_Class.createC();
		String q = "insert into book(book_id,title,author,category,price)values(?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(q);
		ps.setString(1, st.getBook_id());
		ps.setString(2, st.getBook_Title());
		ps.setString(3, st.getBook_Author());
		ps.setString(4, st.getBook_Category());
		ps.setFloat(5, st.getBook_Price());
		ps.executeUpdate();
		f=true;
		return f;
				
	}

	public static void dis_allDao()  throws Exception{
		Connection con = Connection_Class.createC();
		String q = "select * from book";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(q);
		System.out.println("Book_Id\t\tBook_Title\t\tBook_Author\t\tBook_Category\t\tBook_Price");
		while(rs.next())
		{
			String id = rs.getString(1);
			String title = rs.getString(2);
			String author = rs.getString(3);
			String category = rs.getString(4);
			float price = rs.getFloat(5);
			 System.out.print(rs.getString(1));
	           System.out.print("\t\t"+rs.getString(2));
	           System.out.print("\t\t\t"+rs.getString(3));
	           System.out.print("\t\t\t"+rs.getString(4));
	           System.out.print("\t\t\t"+rs.getFloat(5));
	           System.out.println();
		}

		
	}

	public static boolean dis_titleDao(String til) throws Exception {
		String s = "select * from book where title=?"; 
		boolean f = false;
		Connection con = Connection_Class.createC();
		PreparedStatement ps = con.prepareStatement(s);
		ps.setString(1, til);
		System.out.println("**=============**=================**=============**");
		ResultSet rs = ps.executeQuery();
		System.out.println("Book_Id\t\tBook_Title\t\tBook_Author\t\tBook_Category\t\tBook_Price");
		while(rs.next())
		{
			
			 System.out.print(rs.getString(1));
	           System.out.print("\t\t"+rs.getString(2));
	           System.out.print("\t\t\t"+rs.getString(3));
	           System.out.print("\t\t\t"+rs.getString(4));
	           System.out.print("\t\t\t"+rs.getFloat(5));
	           System.out.println();			
		}
		System.out.println("**=============**=================**=============**");
		f= true;
		return f;
	}

	public static boolean dis_authorDao(String au) throws Exception {
		String s = "select * from book where author=?"; 
		boolean f = false;
		Connection con = Connection_Class.createC();
		PreparedStatement ps = con.prepareStatement(s);
		ps.setString(1, au);
		System.out.println("**=============**=================**=============**");
		ResultSet rs = ps.executeQuery();
		System.out.println("Book_Id\t\tBook_Title\t\tBook_Author\t\tBook_Category\t\tBook_Price");
		while(rs.next())
		{
			
			 System.out.print(rs.getString(1));
	           System.out.print("\t\t"+rs.getString(2));
	           System.out.print("\t\t\t"+rs.getString(3));
	           System.out.print("\t\t\t"+rs.getString(4));
	           System.out.print("\t\t\t"+rs.getFloat(5));
	           System.out.println();			
		}
		System.out.println("**=============**=================**=============**");
		f= true;
		return f;
	}


}

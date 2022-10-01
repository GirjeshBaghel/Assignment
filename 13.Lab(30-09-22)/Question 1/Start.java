package JDBC_Program;

import java.sql.*;
import java.util.Scanner;

public class Start {

	Scanner sc = new Scanner(System.in);					// global variable and connection with mysql
	int id,up ;
	String name,ph,city,query;
	Connection con;
	String url = "jdbc:mysql://localhost:3306/student_manager";
	String user = "root";
	String pass = "12345";
	
	public Connection create() throws Exception				// connection create function
	{
		
		 query = "insert into student values(?,?,?,?)";
		 con =DriverManager.getConnection(url,user,pass);
		 return con;
	}
	public void addstd() throws Exception					// add student data method
	{
		create();
		PreparedStatement ps = con.prepareStatement(query);
		System.out.print("Enter Id : ");
		 id = sc.nextInt();
		
		System.out.print("Enter Name : ");
		 name = sc.next();
		 
		 System.out.print("Enter Phone No : ");
		 ph = sc.next();
		 
		 System.out.print("Enter City : ");
		 city = sc.next();
		 
		 ps.setInt(1,id);
		 ps.setString(2,name);
		 ps.setString(3,ph);
		 ps.setString(4,city);
		 ps.execute();
		 ps.close();
		 con.close();
		 System.out.println("Data Successfully Added ..");
		
	}
	public void delstd() throws Exception					// delete student data
	{
		create();
		
		System.out.print("Enter Student Id :  ");
		int delid = sc.nextInt();
		String del = "delete from student where s_id=?";
		PreparedStatement ps1 = con.prepareStatement(del);
		
		ps1.setInt(1, delid);
		ps1.executeUpdate();
		ps1.close();
		con.close();
		System.out.println("Deleted Successfully ");
	}
	
	public void show() throws Exception						// show student data
	{
		create();
		 ResultSet rst = null;
		String sh = "select * from student";
		PreparedStatement ps1 = con.prepareStatement(sh);
		rst = ps1.executeQuery();
		System.out.println("Id\t\tName\t\tPhone\t\tCity\n");
        while(rst.next()) {
           System.out.print(rst.getInt(1));
           System.out.print("\t\t"+rst.getString(2));
           System.out.print("\t\t"+rst.getString(3));
           System.out.print("\t"+rst.getString(4));
           System.out.println();
        }
		ps1.close();
		con.close();
		
	}
	public void update() throws Exception							// update student data
	{
		//System.out.println("Enter the Id to Update Student Data : ");
		//up = sc.nextInt();
		System.out.println("Press 1 : Update Name  ");
		System.out.println("Press 2 : Update Phone No  ");
		System.out.println("Press 3 : Update City  ");
		System.out.print("\nPlease Enter you Choice : ");
		int ch = sc.nextInt();
		switch(ch)
		{
			case 1:
			name();
			break;
			
			case 2:
				phno();
				break;
				
			case 3:
				city();
				break;
				
		}
			
	}
	public void name() throws Exception					//  update the name of student
	{
		System.out.print("Enter Id here : ");
		int n_id = sc.nextInt();
		System.out.print("Enter Name here : ");
		String nup = sc.next();
		String nqu = "update  student set s_name=? where s_id = ?";
		con = DriverManager.getConnection(url,user,pass);
		PreparedStatement ps1 = con.prepareStatement(nqu);
		ps1.setString(1,nup);
		ps1.setInt(2,n_id);
		ps1.executeUpdate();
		System.out.println("Data Updated.. ");
		ps1.close();
		
	}
	
	public void phno() throws Exception				// update the student phone no here
	{
		System.out.print("Enter Id here : ");
		int n_id = sc.nextInt();
		System.out.print("Enter Phone No here : ");
		String nup = sc.next();
		String nqu = "update  student set s_phone=? where s_id = ?";
		con = DriverManager.getConnection(url,user,pass);
		PreparedStatement ps1 = con.prepareStatement(nqu);
		ps1.setString(1,nup);
		ps1.setInt(2,n_id);
		ps1.executeUpdate();
		System.out.println("Data Updated.. ");
		ps1.close();
		
	}
	
	public void city() throws Exception  				// update the city of student
	{
		System.out.print("Enter Id here : ");
		int n_id = sc.nextInt();
		System.out.print("Enter City Name here : ");
		String nup = sc.next();
		String nqu = "update  student set s_city=? where s_id = ?";
		con = DriverManager.getConnection(url,user,pass);
		PreparedStatement ps1 = con.prepareStatement(nqu);
		ps1.setString(1,nup);
		ps1.setInt(2,n_id);
		ps1.executeUpdate();
		System.out.println("Data Updated.. ");
		ps1.close();
		
	}
	
	public void start() throws Exception				// start method that call the inside the main method
	{
		
		char ans;
		System.out.println("Welcome to Student Manager App");
		do
		{
			System.out.println("PRESS 1 : ADD Student Data");
			System.out.println("PRESS 2 : DELETE Student Data");
			System.out.println("PRESS 3 : DISPLAY Student Data");
			System.out.println("PRESS 4 : Update Student Data");
			System.out.print("\nPlease Enter your Choice :" );
			
			int c = sc.nextInt();
			switch(c)
			{
				case 1:
					addstd();
					break;
				
				case 2:
					delstd();
					break;
					
				case 3:
					show();
					break;
				case 4:
					update();
					break;
				default:
					break;
				
			}
			System.out.println("Do you want to Continue  :  Y/N");
			ans = sc.next().charAt(0); 
		}
		while(ans == 'y' || ans =='Y');
		System.out.println("Thanks You for using this Application");
			
	}
	
	public static void main(String[] args) throws Exception 		// main method
	{
		Start ob = new Start();
		ob.start();
	}

}

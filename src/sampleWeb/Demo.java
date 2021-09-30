package sampleWeb;

import java.sql.*;
public class Demo {
	
	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/test";
		String uname = "root";
		String pass = "Asha1993#";
		String query = "select * from student";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname, pass);
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String name = rs.getString("name");
		System.out.println(name);
		
		st.close();
		con.close();
		
	}

}

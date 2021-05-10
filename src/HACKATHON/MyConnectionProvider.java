package HACKATHON;

import java.sql.*;

public class MyConnectionProvider{
	static Connection con=null;
	public static Connection getCon()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","oracle");
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}


}

package HACKATHON;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DDaoImpl implements DuserDAo {
	static Connection con;
	static PreparedStatement ps;
	

	@Override
	public int insertDoctors(Duser p) { 
		
		int status=0;
		try {
			con=MyConnectionProvider.getCon();
			ps=con.prepareStatement("insert into hc values(?,?,?,?,?)");
			ps.setString(1, p.getUsername());
			ps.setString(2, p.getName());
			ps.setString(3, p.getPassword());
			ps.setString(4, p.getRepass());
			ps.setString(5, p.getSpecialization());
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
	}

	@Override
	public Duser getDoctors(String userid, String pass) {
		
		Duser p = new Duser();
		try {
			con = MyConnectionProvider.getCon();
			ps=con.prepareStatement(" select * from hc where Username=? and Password=?");
			ps.setString(1,userid);
			ps.setString(2,pass);
			
			ResultSet  rs = ps.executeQuery();
			
			while(rs.next())
			{
					p.setUsername(rs.getString(1));
					p.setPassword(rs.getString(2));
					p.setName(rs.getString(3));
				
			}
			
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return p;
	}


}

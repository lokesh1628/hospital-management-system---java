package HACKATHON;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Data
 */
@WebServlet("/data")
public class Data extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Data() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
        PrintWriter pw = response.getWriter(); 
        try
        {
       	 String sname=request.getParameter("name");
       	 String gra=request.getParameter("grade");
       	 String add=request.getParameter("address");
       	 String sub=request.getParameter("submit");
       	 Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","oracle");
			PreparedStatement ps=con.prepareStatement("insert into hc1 values(?,?,?)");
			ps.setString(1,sname);
			ps.setString(2,gra);
			ps.setString(3, add);
			int s=ps.executeUpdate();
			String msg=" ";
			if(s!=0)
			{
				request.getRequestDispatcher("Pform.jsp").forward(request,response);
				msg="Record has been inserted";
				pw.println(msg);
			}
			else
			{
				msg="Not Inserted the data";
				pw.println(msg);
			}
			con.close();
        }catch(Exception e)
        {
       	 pw.println(e);
        }
	}

	private int parseInt(String parameter) {
		// TODO Auto-generated method stub
		return 0;
	}

}

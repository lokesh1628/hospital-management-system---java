package HACKATHON;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Doctorregistration
 */
@WebServlet("/doctorregistration")
public class Doctorregistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Doctorregistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DuserDAo  cd = new DDaoImpl();
		String userName = request.getParameter("uname");
		String password = request.getParameter("password1");
		String spl=request.getParameter("spl");
		String submitType=request.getParameter("submit");
		Duser p = cd.getDoctors(userName,password);
		if(submitType.equals("login") && p!=null && p.getName()!=null)
		{
			request.setAttribute("message",p.getPassword());
			request.getRequestDispatcher("Dwelcome.jsp").forward(request,response);
		}
		
		else if(submitType.equals("register"))
		{
			p.setName(request.getParameter("name"));
			p.setPassword(password);
			p.setUsername(userName);
			p.setSpecialization(spl);
			cd.insertDoctors(p);
			request.setAttribute("successmessage","REGISTER IS DONE,PLEASE LOGIN.");
			request.getRequestDispatcher("Dlogin.jsp").forward(request,response);
		}
		
		else
		{
			request.setAttribute("message","NOT REGISTER!!!!,PLEASE REGISTER.");
			request.getRequestDispatcher("Dlogin.jsp").forward(request,response);
		}
		
		
		
		
	}


}

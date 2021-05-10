package HACKATHON;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Pregistration
 */
@WebServlet("/pregistration")
public class Pregistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Pregistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PuserDAO  cd = new PDaoImpl();
		String userName = request.getParameter("uname");
		String password = request.getParameter("password1");
		String submitType=request.getParameter("submit");
		Puser p = cd.getPatients(userName,password);
		if(submitType.equals("login") && p!=null && p.getName()!=null)
		{
			request.setAttribute("message",p.getPassword());
			request.getRequestDispatcher("Pwelcome.jsp").forward(request,response);
		}
		
		else if(submitType.equals("register"))
		{
			p.setName(request.getParameter("name"));
			p.setPassword(password);
			p.setUsername(userName);
			cd.insertPatients(p);
			request.setAttribute("successmessage","REGISTER IS DONE,PLEASE LOGIN.");
			request.getRequestDispatcher("Plogin.jsp").forward(request,response);
		}
		
		else
		{
			request.setAttribute("message","NOT REGISTER!!!!,PLEASE REGISTER.");
			request.getRequestDispatcher("Plogin.jsp").forward(request,response);
		}
		
		
		
		
	}


}

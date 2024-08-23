package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.connectionservlet;
import model.user;
import model.userDatabse;

import java.io.IOException;

/**
 * Servlet implementation class register
 */
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public register() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */ 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		user usermodel=new user(name,email,password);
		userDatabse reguser=new userDatabse(connectionservlet.getConnection());
		if(reguser.saveuser(usermodel))
		{
			response.sendRedirect("index.jsp");
		}
		else {
			String errormessage="user available";
			HttpSession regSession=request.getSession();
			regSession.setAttribute("regError",errormessage);
			response.sendRedirect("reg.jsp");
			
		}
		doGet(request, response);
	}

}

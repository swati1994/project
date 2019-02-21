package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ActionServlet
 */
@WebServlet("/ActionServlet")
public class ActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("userName");
		String pass=request.getParameter("password");
		Login login =new Login();
		login.setName(name);
		login.setPass(pass);
		LoginService service=new LoginService();
		if(service.checkUser(login)){
			response.getWriter().println("Successful registration");
		}
		else
			response.sendRedirect("login.htm");
		

	}

	
}

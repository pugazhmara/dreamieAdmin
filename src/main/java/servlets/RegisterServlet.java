package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.RegisterModel;

import java.io.IOException;
import java.io.PrintWriter;

import controllers.RegisterController;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RegisterModel rm=new RegisterModel();
		response.getWriter().append("Served at: ").append(request.getContextPath());
	    rm.setName(request.getParameter("username"));
	    rm.setPass(request.getParameter("password"));
	    rm.setEmail(request.getParameter("email"));
	    rm.setPhone(request.getParameter("phone"));
//	    System.out.println(name+pass+email+phone);
//	    PrintWriter out=response.getWriter();
//	    out.println(name+pass+email+phone);
	    RegisterController rc=new RegisterController(rm);
	    rc.toStore();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

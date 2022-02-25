package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		req.getRequestDispatcher("Login.html").include(req, resp);
		
		String uname= req.getParameter("uname");
		String pass= req.getParameter("pass");
		
		if(uname.equals("sanketa") && pass.equals("xyz"))
		{ 
			out.println("Welcome "+uname+"<br/>");
			out.println("Login done successfully<br/>");
			out.println("<a href=\"index.html\">logout</a> ");
		}
		else
		{
			out.print("invalid UserName Or Password");
			
		}
	}

}
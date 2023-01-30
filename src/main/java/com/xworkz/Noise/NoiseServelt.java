package com.xworkz.Noise;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2,urlPatterns ="/m")
public class NoiseServelt extends HttpServlet {
	public NoiseServelt() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("NoiseServelt are doPost running...");
		
		String fname= req.getParameter("fname");
		String lname= req.getParameter("lname");
		String gender= req.getParameter("gender");
		String reason= req.getParameter("reason");
		String address= req.getParameter("address");
		//step1:linking jsp page
		//RequestDispatcher dis=req.getRequestDispatcher("show.jsp");
		//sending data to jsp
		
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(gender);
		System.out.println(reason);
		System.out.println(address);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("show.jsp");
		req.setAttribute("fname",fname);
		req.setAttribute("lname",lname);
		req.setAttribute("gender",gender);
		req.setAttribute("reason",reason);
		req.setAttribute("address",address);
		dispatcher.forward(req, resp);




		
		

		
	}

}

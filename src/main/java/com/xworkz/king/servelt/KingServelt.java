package com.xworkz.king.servelt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2,urlPatterns = "/king")
public class KingServelt extends HttpServlet {
	
	public KingServelt() {
		System.out.println("KingServelt"+getClass().getSimpleName());
		
		
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("running the init config..");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(" running the get....");
		System.out.println(Thread.currentThread().getName());
		String name=req.getParameter("kingname");
		String alive=req.getParameter("alive");
		String relogion=req.getParameter("religion");
		String queens=req.getParameter("no of queens");
		String dob=req.getParameter("dateofbirth");
		String dod=req.getParameter("deathday");
		
		System.out.println(name);
		System.out.println(alive);
		System.out.println(relogion);
		System.out.println(queens);
		System.out.println(dob);
		System.out.println(dod);
		
		PrintWriter writer=resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:green;'>");
		writer.print("kingname"+name+"is rule sucessfull");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
				
	}

}

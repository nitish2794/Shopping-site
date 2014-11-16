package com.nitts.shopperparadise;

import java.io.IOException;


import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class productstorer extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String name= request.getParameter("name");
		String costs = request.getParameter("cost");
		int cost=Integer.parseInt(costs);
		String imgurl = request.getParameter("imgurl");
		//String password = request.getParameter("password");
		//PrintWriter out = response.getWriter();
		//out.println(password);
		//if(password=="nitts")
		//{
		EntityProduct e = new EntityProduct(name,"Drinks",imgurl,cost);
		ofyService.ofy().save().entity(e).now();
		//}
		/*else
		{
			
			response.setContentType("text/html");
			out.print("<html><body>");
			out.print("<h2>Password Not correct.</h2>");
			out.print("</body></html>");
		}*/
	}
}
package com.nitts.shopperparadise;

import java.io.IOException;


import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class promostorer extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String code= request.getParameter("code");
		String discounts = request.getParameter("discount");
		//String password = request.getParameter("password");
		//PrintWriter out = response.getWriter();
		//out.println(password);

		//if(password=="nitts")
		//{
		int discount=Integer.parseInt(discounts);
		EntityPromo e = new EntityPromo(code,discount);
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
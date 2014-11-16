package com.nitts.shopperparadise;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class mainui extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String username= request.getParameter("username");
		List<EntityPromo> promos =   ofyService.ofy().load().type(EntityPromo.class).list();
		List<EntityProduct> products =   ofyService.ofy().load().type(EntityProduct.class).list();
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
	out.println("<!doctype html><html class=\"no-js\" lang=\"en\"><head><meta charset=\"utf-8\" /><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" /><title>Shopper's Paradise | Welcome</title><link rel=\"stylesheet\" href=\"css/foundation.css\" /><script src=\"modernizr.js\"></script>");
		
		out.println("<script>/*<![CDATA[*/");
		
		out.println("!window.QUnit");
		out.println("&& ");
		out.println("document.write");
		out.println("('<script src=\"qunit.js\">");
		out.println("<\\/script>')");
		out.println("/*]]>*/</script>");
		
		out.println("<script src=\"http://swarm.simplecartjs.com/js/inject.js\"></script>");
		out.println("<script>/*<![CDATA[*/		if( QUnit.urlParams.lib && QUnit.urlParams.ver ){		document.write('<script src=\"https://ajax.googleapis.com/ajax/libs/'+ 					QUnit.urlParams.lib + '/' + 					QUnit.urlParams.ver + '/' + 					QUnit.urlParams.lib + '.js\"><\\/script>');	} else {		document.write('<script src=\"jquery.1.6.1.min.js\"><\\/script>');	}");
		out.println("if( QUnit.urlParams.commit ){		document.write('<script src=\"get-raw-javascript.php?file=https://raw.github.com/wojodesign/simplecart-js/'+ QUnit.urlParams.commit +'/simpleCart.js\"><\\/script>');		document.write('<script src=\"get-raw-javascript.php?file=https://raw.github.com/wojodesign/simplecart-js/'+ QUnit.urlParams.commit +'/test/test.core.js\"><\\/script>');	} else {		document.write('<script src=\"simpleCart.js\"><\\/script>');		document.write('<script type=\"text/javascript\" src=\"test.core.js\"><\\/script>');	}	/*]]>*/</script>");
		
		out.println("");
		out.println("");
		out.println("");
		out.println("");
		out.println("");
		out.println("");
		out.println("");

		
		out.println("<style>body {background-image: url(\"back.jpg\");background-color: #cccccc;}");
		out.println(".divbox {width: 125px;padding: 5px;border: 2px solid navy;margin: 5px;float:left;}");
		out.println("h2 {    font-size: 30px;}");
		out.println("</style>  </head>  <body><img src=\"logo.jpg\"  alt =\"logo\"   style=\"position:absolute; TOP:5px; LEFT:200px;width:800px;height:75px\" >");
		out.println("<form action=\"admin.html\" method=\"GET\"><input  style=\"float:right;margin-right:10px;\"  type=\"submit\" class=\"Small round button\" value=\"Admin Login\"></form><br><br><br><br><br><hr>&nbsp;&nbsp; ");
		
		out.println("Welcome "+username+"<hr>");
		out.println("<div style=\"float:left; width:50%;\"><dl class=\"tabs\" data-tab><dd class=\"active\"><a href=\"#panel1\">Soft Drinks</a></dd><dd><a href=\"#panel2\">Product 2</a></dd>		<dd><a href=\"#panel3\">Product 3</a></dd>	  <dd><a href=\"#panel4\">Product 4</a></dd></dl>");
		out.println("<div class=\"tabs-content\">  <div class=\"content active\" id=\"panel1\">    <p>");
		//for loop
		for(EntityProduct product:products)
		out.println("<div class=\"divbox\"> <div class=\"simpleCart_shelfItem\"><h6><img class=\"item_thumb\" src=\""+product.getImgurl()+"\" height=100 width=75 ><br> <h5 class=\"item_name\">"+product.getName()+"</h5><span class=\"item_price\">$"+product.getCost()+ "</span><input type=\"button\" class=\"item_add\" value=\"Add to cart\" /></div></div>");
		out.println("</p></div>	  <div class=\"content \" id=\"panel2\"></div>	  <div class=\"content\" id=\"panel3\"></div>	  <div class=\"content\" id=\"panel4\"></div>	</div></div>");
		
		
		out.println("  <div style=\"float:right; width:50%;\">");
		out.println("<fieldset><legend>YOUR CART</legend>");
		//forloop
		out.println("<p>		Cart: <span class=\"simpleCart_total\"></span> (<span id=\"simpleCart_quantity\" class=\"simpleCart_quantity\"></span> items)		<br />		<a href=\"javascript:;\" class=\"simpleCart_empty\">Empty Cart</a>		<br />		</p>	");
		out.println("<div class=\"simpleCart_items\" >		</div>		SubTotal: <span id=\"simpleCart_total\" class=\"simpleCart_total\"></span> <br>");
		out.println("<form action=\"#\">Enter Promocode(if available):<input type=\"text\" name=\"promo\" placeholder=\"Promocode\"><br>");
		
		out.println("<input type=\"submit\" class=\"button [tiny small large]\" value=\"Apply Promocode\" />	<br>		-----------------------------<br>");
		out.println("	Final Total: <span id=\"simpleCart_grandTotal\" class=\"simpleCart_grandTotal\"></span> <br />");
		out.println("<input type=\"submit\" class=\"button [tiny small large]\" value=\"Confirm Order\"></form></div></fieldset>");
		out.println("</body><script src=\"jquery.js\"></script>    <script src=\"foundation.min.js\"></script>    <script>");
		out.println("      $(document).foundation();");
		out.println("    </script>  </body></html>");
		
		out.println("");
		out.println("");
		out.println("");
		out.println("");
		}

}

package com.xworkz.shirts;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.shirts.dto.ShirtsDto;
import com.xworkz.shirts.service.ShirtsService;
import com.xworkz.shirts.service.ShirtsServiceImpl;
@WebServlet("/readAll")
public class ReadServlet extends HttpServlet {
	
ShirtsService service = new ShirtsServiceImpl(); 
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException , IOException{
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
	List<ShirtsDto> list	= service.readAll();
	
	out.print("<table>");
	for (ShirtsDto dto : list) {
		out.println("<tr>");
		out.println("<td>");
		out.println(dto.getName());
		out.println("</td>");
		
		out.println("<td>");
		out.println(dto.getColor());
		out.println("</td>");
		
		out.println("<td>");
		out.println(dto.getPrice());
		out.println("</td></tr>");

	}
		
	out.print("</table>");
	
	
	}
}


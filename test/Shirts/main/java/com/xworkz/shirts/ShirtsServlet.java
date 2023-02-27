package com.xworkz.shirts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.shirts.dto.ShirtsDto;
import com.xworkz.shirts.service.ShirtsService;
import com.xworkz.shirts.service.ShirtsServiceImpl;

@WebServlet("/shirts")
public class ShirtsServlet extends HttpServlet {
	
ShirtsService service = new ShirtsServiceImpl();
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
     
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String  name = req.getParameter("name");
		String color = req.getParameter("color");
		String price = req.getParameter("price");
		ShirtsDto dto = new ShirtsDto(name, color, price);
		
	boolean	status = service.save(dto);
	
	
	if(status) {
		req.getRequestDispatcher("read.jsp").forward(req,res);
	} else {
		req.getRequestDispatcher("shirts.jsp").include(req,res);
	}
	
	}	
	
}


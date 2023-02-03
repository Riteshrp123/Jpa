package com.xworkz.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value= "/simple")	
public class SimpleServlets  extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse responce) throws IOException
	{
    responce.setContentType("text/html");
    
	PrintWriter writer = responce.getWriter();
	
	writer.print("<html><body>");
	writer.print("<h1>The Batman</h1>");
	writer.print("<html><body>");
	
   }
}

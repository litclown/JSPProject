package com.byenghak.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calc")
public class Calc extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String number1 = request.getParameter("first_number");
		String number2 = request.getParameter("second_number");
		String op = request.getParameter("operator");
		
		
		int first_number = 0;
		int second_number = 0;
		
		if(!number1.equals("")) first_number = Integer.parseInt(number1);
		if(!number2.equals("")) second_number = Integer.parseInt(number2);
		
		int result = 0;
		
		if(op.equals("덧셈"))
		result = first_number + second_number;
		else
		result = first_number - second_number;
		
		response.getWriter().printf("result is %d\n", result);
		
	}

}

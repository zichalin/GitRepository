package com.cakeshop.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OrderSubmitServlet
 */
@WebServlet("/order_submit")
public class OrderSubmitServlet extends HttpServlet {
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getSession().getAttribute("user") != null) {
			request.getRequestDispatcher("order_submit.jsp").forward(request, response);
		}else {
			request.setAttribute("fmsg", "请先登陆，再进行支付购买！");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
	}
	
}

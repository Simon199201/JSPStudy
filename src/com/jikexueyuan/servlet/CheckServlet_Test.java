package com.jikexueyuan.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckServlet_Test extends HttpServlet {

	private static final long serialVersionUID = 6520550639750164887L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse rep)
			throws ServletException, IOException {
		String name = req.getParameter("userName");
		String password = req.getParameter("password");
		System.out.println("userName is " + name);
		System.out.println("password is " + password);
		String forward = null;
		if (name != null && name.equals("simon") && password != null
				&& password.equals("123456")) {
			forward = "/14/success_test.jsp";
			RequestDispatcher rd = req.getRequestDispatcher(forward);
			rd.forward(req, rep);
		} else {
			forward = "/14/error_test.jsp";
			RequestDispatcher rd = req.getRequestDispatcher(forward);
			rd.forward(req, rep);
		}
	}
}

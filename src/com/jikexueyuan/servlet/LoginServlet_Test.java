package com.jikexueyuan.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet_Test extends HttpServlet {

	private static final long serialVersionUID = 6520550639750164887L;

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
			String name = arg0.getParameter("userName");
			String password = arg0.getParameter("password");
			System.out.println("userName is " +name);
			System.out.println("password is " +password);
			String forward = null;
			if (name!=null&&name.equals("simon")&&password!=null&&password.equals("123456")) {
				forward = "/14/success_test.jsp";
				RequestDispatcher rd = arg0.getRequestDispatcher(forward);
				rd.forward(arg0, arg1);
			}else {
				forward ="/14/error_test.jsp";
				RequestDispatcher rd = arg0.getRequestDispatcher(forward);
				rd.forward(arg0, arg1);
			}
	}
}

package com.jikexueyuan.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet_Test extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = -866902716796624832L;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("========init========");
		super.init();
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("========init with config========");
		super.init(config);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("========init========");
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("========doPost========");
		super.doPost(req, resp);
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		System.out.println("========service========");
		PrintWriter pw = arg1.getWriter();
		pw.write("Hello World");
	}

	@Override
	public void destroy() {
		System.out.println("========destroy========");
		super.destroy();
	}
	
	

}

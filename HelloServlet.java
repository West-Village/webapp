package com.ai;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;

public class HelloServlet implements Servlet{
	
	@Override
	public void destroy(){
		System.out.println("destory...");
	}
	
	@Override
	public ServletConfig getServletConfig(){
		System.out.println("getServletConfig...");
		return null;
	}

	@Override
	public String getServletInfo(){
		System.out.println("getServletInfo...");
		return null;
	}
	
	//Servlet初始化
	@Override
	public void init(ServletConfig servletConfig) throws ServletException{
		System.out.println("init");
		//获取ServletContext对象
		ServletContext servletContext = servletConfig.getServletContext();
		String dirver = servletContext.getInitParameter("driver");
		System.out.println("driver："+dirver);

		Enumeration<String> names = servletContext.getInitParameterNames();
		While(names.hasMoreElements());{
			String name = names.nextElement();
			System.out.println("-->"+name);
		}
		String contextPath = servletContext.getContextPath();
		System.out.println(contextPath);
		
		
	}
	
	private void While(boolean hasMoreElements) {
		// TODO Auto-generated method stub
		
	}
	
	//Servlet服务
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
		throws ServletException, IOException{
		System.out.println("service");
	}
	
	//构造函数
	public HelloServlet() {
		// TODO Auto-generated method stub
		System.out.println("HelloServlet's constructor");
	}
	
		
	}
	


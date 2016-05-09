package com.pssys.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 过滤器，目前没有任何作用
 * @author zengyufei
 * 2016-5-9 下午9:13:26
 */
public class ConfigFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException
	{
		// TODO Auto-generated method stub
		System.out.println("123");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		// TODO Auto-generated method stub
		
	}

	public void destroy()
	{
		// TODO Auto-generated method stub
		
	}
	
}

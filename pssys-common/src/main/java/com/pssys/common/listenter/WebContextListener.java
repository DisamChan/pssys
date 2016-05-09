package com.pssys.common.listenter;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;

/**
 * web启动首先加载的类，目前没有任何作用
 * @author zengyufei
 * 2016-5-9 下午9:12:39
 */
public class WebContextListener extends ContextLoaderListener {

	@Override
	public WebApplicationContext initWebApplicationContext(ServletContext servletContext) {
		/*String contextPath = servletContext.getContextPath();
		servletContext.setAttribute("basePath", contextPath);*/
		return super.initWebApplicationContext(servletContext);
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent event) {
		super.contextDestroyed(event);
	}
}

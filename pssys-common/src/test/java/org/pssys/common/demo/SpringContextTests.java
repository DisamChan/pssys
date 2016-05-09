package org.pssys.common.demo;

import org.junit.Test;
import org.pssys.common.demo.service.TestAnnotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Spring 单元测试基类
 * @version 2013-05-15
 */
@ContextConfiguration(locations = {"/spring-context.xml"})
public class SpringContextTests extends AbstractJUnit4SpringContextTests {
	@Autowired
	private TestAnnotationService testAnnotationService;
	
	@Test
	public void test1() throws Exception{
		testAnnotationService.getName();
	}
}

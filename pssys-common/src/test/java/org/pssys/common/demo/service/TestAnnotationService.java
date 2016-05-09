package org.pssys.common.demo.service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.pssys.common.demo.TestValue;
import org.springframework.stereotype.Service;

@Service
public class TestAnnotationService {
	
	@TestValue(value="zengyufei")
	public void getName() throws Exception{
	}
	
	public TestAnnotationService() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		Method[] methods = this.getClass().getMethods();
		for (Method method : methods) {
	        if(method.isAnnotationPresent(TestValue.class)){
	        	TestValue testValue = method.getAnnotation(TestValue.class);
	        	System.out.println(testValue.value());
	        }
        }
	}
	
}

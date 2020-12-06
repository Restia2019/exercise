package com.how2java.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggerAspect { 
	 
	@Before("execution(* com.how2java.service.ProductService.*(..))")
    public void before() {
        System.out.println("start log");
    }
    
	@After("execution(* com.how2java.service.ProductService.*(..))")
    public void after() {
        System.out.println("finish log");
    }
}
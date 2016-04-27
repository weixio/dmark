package com.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//把这个类生命为一个切面
@Aspect
@Component
public class AsceptDemo {
	
	//声明该方法是一个前置通知
		@Before("execution(* com.mark.dao.testDao.*(..))")
		public void beforeMethod(){
			System.out.println("before...");
		}
}

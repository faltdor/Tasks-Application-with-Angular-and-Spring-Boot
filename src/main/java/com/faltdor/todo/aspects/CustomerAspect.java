package com.faltdor.todo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class CustomerAspect {	
	
	@Before("execution(* com.faltdor.todo.controller.TaskController.saveTask(..))")
	public void saveTask(JoinPoint joinPoint) {
		System.out.println("Excute Controller Method: " + joinPoint.getSignature().getName());
	}
	
	@Before("execution(* com.faltdor.todo.controller.TaskController.listTask(..))")
	public void listTask(JoinPoint joinPoint) {
		System.out.println("Excute Controller Method: " + joinPoint.getSignature().getName());
	}
}

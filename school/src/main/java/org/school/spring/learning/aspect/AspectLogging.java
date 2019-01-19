package org.school.spring.learning.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectLogging {

	@Before("@annotation(org.school.spring.learning.aspect.Loggable)")
	public void logging() {
		System.out.println("aspect running. Aspect finished!");
	}

	@Before("allSquareMethod()")
	public void secondAdvice(JoinPoint joinPoint) {
		System.out.println(joinPoint.getTarget());
	}

	@Pointcut("execution(* get*(*))")
	private void allGetters() {

	}

	@Pointcut("within(org.school.spring.learning.aspect.bean.Square)")
	private void allSquareMethod() {

	}

	@After("args(name)")
	private void argCallAdvice(String name) {
		System.out.println("argCallAdvice is running " + name);
	}

	@AfterReturning("args(name)")
	private void argCallAdvice2(String name) {
		System.out.println("argCallAdvice 2 is running " + name);
	}

	@AfterThrowing("args(name)")
	private void argCallAdvice3(String name) {
		System.out.println("argCallAdvice Exception advice is running " + name);
	}

	
	public void aroundAdvice(String name, ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("Before advice is run");
		proceedingJoinPoint.proceed();
		System.out.println("After Advice is run");
		System.out.println("argCallAdvice Exception advice is running " + name);
	}

}

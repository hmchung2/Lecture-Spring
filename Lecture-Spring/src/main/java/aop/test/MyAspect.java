package aop.test;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

// 객체를 만들기 위해 service 선언
@Service
@Aspect
public class MyAspect {
	
	@After("execution(* aop.test.*.setAge(..))")
	public void checkAdult(JoinPoint joinPoint) {
		Object[] args = joinPoint.getArgs();
		if((Integer)args[0] < 20) {
			System.out.println("미성년자입니다");
		} else {
			System.out.println("성인입니다");
		}
		
	}
	
	@Around("execution(* aop.test.*.setAge(..))")
	public void checkAdult2(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println(Arrays.toString(joinPoint.getArgs()));
		// before annotation과 동일 
		joinPoint.proceed();
	}
	
	@AfterThrowing(pointcut="execution(* aop.test.*.setAge(..))", throwing="ex")
	public void error(JoinPoint joinPoint, Throwable ex) {
		System.out.println("예외처리 : " + ex.toString());
	}
	
	
	
	
}

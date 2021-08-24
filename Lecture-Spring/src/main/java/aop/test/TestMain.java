package aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 	spring aop 특징
 	1. Runtime 기반
 	2. Proxy 기반
 	3. 인터페이스 기반
 	나중에 getBean("programmer")로 받으면 안됨
 		인터페이스 기반이므로
 			Employee e = 로 받아야함 (Employee형으로 받아야함)
 */

public class TestMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("aoptest/beancontainer.xml");
		
		Person p = context.getBean("man", Person.class);
		
		try {
			p.setAge(20);
			p.setAge(-14);
		} catch (Exception e) {
		}
		
	}
	
}

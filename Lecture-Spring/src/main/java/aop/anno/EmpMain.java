package aop.anno;

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

public class EmpMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("aop-anno.xml");
		
//		Employee e = context.getBean("programmer", Employee.class);
		Employee e = context.getBean("designer", Employee.class);
		e.work();
		
		// 패키지가 다르므로 인터페이스 앞에 패키지명을 붙여준다!
		aop.xml.Employee e2 = context.getBean("programmer2", aop.xml.Employee.class);
		e2.work();
	}
	
}

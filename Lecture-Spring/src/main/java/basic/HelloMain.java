package basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		
		// 실행하는 순간, beanContatiner.xml에 있는 모든 객체를 생성해서 보관 그리고 생성완료.. 라는 글자가 뜸
		// bean 하나당 객체 한개 만들어짐
		ApplicationContext context = new GenericXmlApplicationContext("beanContainer.xml");
								//	= new FileSystemXmlApplicationContext("src/main/resources/beanContainer.xml");
								//	= new ClassPathXmlApplicationContext("beanContainer.xml");
		
		// 객체 하나 가져오고 싶을 때 getBean, returntype은 object형
		// bean 하나가 싱글턴 패턴으로 하나씩 만들기 때문에 주소값은 동일하다
		Hello obj = (Hello)context.getBean("hello");
		// System.out.println(obj);
		obj.prnMsg();
		
		Hello obj2 = context.getBean("hello2", Hello.class);
		obj2.prnMsg();
		
		
		
		// 기존 방법 => 이거를 beanContainer.xml에서 할 거야
		/*
		 * Hello obj = new Hello(); obj.prnMsg();
		 */
	}
	
}

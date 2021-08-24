package di.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {

		ApplicationContext context = new GenericXmlApplicationContext("di-cal.xml");
		
		context.getBean("");
		
	}
}

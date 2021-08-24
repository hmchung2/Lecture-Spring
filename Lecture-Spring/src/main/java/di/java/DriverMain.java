package di.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DriverMain {

	public static void main(String[] args) {
		
		// Xml 파일 읽어서 그 만들어진 객체들을 SpringContainer에 넣었음
		//new GenericXmlApplicationContext()
		
		// config 파일을 읽어서 환경설정을 해주겠다~
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Car car = context.getBean("car", Car.class);
		car.prnTireBrand();
		
	}
	
}

package di.xml02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DriverMain {

	public static void main(String[] args) {

		
		
		/* 이 부분을 SpringContainer로 만들어보자!
		 * ApplicationContext context = new
		 * GenericXmlApplicationContext("di-xml01.xml");
		 * 
		 * Tire tire = new HankookTire(); Car car = new Car(tire); car.prnTireBrand();
		 */
	
		
		  ApplicationContext context = new
		  GenericXmlApplicationContext("di-xml02.xml");
		 
		  Car car = context.getBean("car", Car.class); car.prnTireBrand();
		 
		// setter 주입은 매개변수가 항상 하나이다
		// but 생성자 주입은 여러개
		
	
	}
}

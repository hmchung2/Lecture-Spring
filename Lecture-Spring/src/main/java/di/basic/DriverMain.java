package di.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DriverMain {

	public static void main(String[] args) {

		// SpringContainer로 만들어보자!
		ApplicationContext context = new GenericXmlApplicationContext("di-xml01.xml");
		// 방법2 xml 설정을 통해서 의존주입까지 끝
		System.out.println("여긴어디 : " + context.getBean("car2"));
		di.xml01.Car car = (di.xml01.Car) context.getBean("car2");
		car.prnTireBrand();
		
		/*
		 * // 방법1 
		 * Car car = (Car)context.getBean("car");
		 *  Tire tire = (Tire)context.getBean("tire");
		 *  car.setTire(tire);
		 *  car.prnTireBrand();
		 */
		
		/*
		 * Car car = new Car();
		 * Tire tire = new HankookTire(); 
		 * car.setTire(tire);
		 * car.prnTireBrand();
		 */
		}
	
}

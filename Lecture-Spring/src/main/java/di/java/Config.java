package di.java;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"di.java"})
@Configuration
public class Config {
	// 객체수가 더 늘어날 경우, bean을 더 생성해야하므로 불편 => ComponentScan 사용
//	@Bean
//	public Car car() {
//		return new Car();
//	}
//	
//	@Bean
//	@Qualifier("hankook")
//	public Tire hankookTire() {
//		return new HankookTire();
//	}
//	
//	@Bean
//	@Qualifier("kumho")
//	public Tire kumhoTire() {
//		return new KumhoTire();
//	}
	
}

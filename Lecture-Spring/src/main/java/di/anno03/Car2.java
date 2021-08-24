package di.anno03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car2 {
	
	@Autowired
	@Qualifier("kumhoTire")
	private Tire tire;
	
	public Car2() {
		System.out.println("Car()...");
	}
	
	/*
	 * @Autowired public Car(@Qualifier("hankookTire") Tire tire) { this.tire =
	 * tire; System.out.println("Car(Tire)..."); }
	 */
	
//	@Resource
	// resource는 이름매핑이 먼저이기 때문에 nexenTire를 먼저 매핑하는데 이는 tire 클래스가 아니므로 오류발생
	//@Autowired
	// 금호타이어라는 객체를 주입하고 싶어~ qualifier
	//@Qualifier("hankookTire")
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire()...");
	}

	public void prnTireBrand() {
		System.out.println("장착된 타이어 : " + tire.getBrand());
	}
	
}

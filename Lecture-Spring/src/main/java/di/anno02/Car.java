package di.anno02;

import javax.annotation.Resource;

public class Car {
	
	@Resource
	private Tire tire;
	
	public Car() {
		System.out.println("Car()...");
	}
	
	public Car(Tire tire) {
		this.tire = tire;
		System.out.println("Car(Tire)...");
	}
	
//	@Resource
	// resource는 이름매핑이 먼저이기 때문에 nexenTire를 먼저 매핑하는데 이는 tire 클래스가 아니므로 오류발생
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire()...");
	}

	public void prnTireBrand() {
		System.out.println("장착된 타이어 : " + tire.getBrand());
	}
	
}

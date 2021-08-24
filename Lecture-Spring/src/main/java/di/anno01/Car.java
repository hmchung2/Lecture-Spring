package di.anno01;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {

	// 의존관계 발생
	// field에다가 annotation을 해도 자동주입가능
	@Autowired
	private Tire tire;
	
	// 타이어 없는 차
	public Car() {
		System.out.println("Car()...");
	}

	// DI(의존주입) : 1) 생성자를 통해서 받아옴
	// 한국타이어가 상속관계이므로 tire 자리에 hankookTire가 들어감
	// new Car(new HankookTire()) 하는 것이 목적
	// car를 생성할때 tire에 들어갈 객체를 autowired 자동으로 찾아서 주입
	// 1> Autowired => 타입매핑(상속관계)을 한다(Tire) 없으면 이름매핑(id="tire")
//	@Autowired
	public Car(Tire tire) {
		this.tire = tire;
		System.out.println("Car(Tire)...");
	}
	
	/*
	 * public Car() { // 의존관계 설정을 누구로 할 것이냐에 따라 결과가 바뀜 // 근데 이거는 개발자가 필요한 시점에 객체를
	 * 생성하는 것이므로 싫어! // 외부에서 객체를 만들어내고 싶어!! tire = new KumhoTire(); // tire = new
	 * HankookTire(); }
	 */
	
	// DI(의존주입) : 2) setter 주입
	// setter 주입할 때 기본생성자 먼저 호출하고 동작하므로 기본생성자 필수!!
//	@Autowired
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire()...");
	}

	public void prnTireBrand() {
		System.out.println("장착된 타이어 : " + tire.getBrand());
	}
	
}

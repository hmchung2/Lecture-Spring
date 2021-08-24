package di.xml01;

import di.anno01.Tire;

public class Car {
	/*
	 * // Car가 동작하기 위해서는 tire가 있어야한다 라는 code private Tire tire;
	 * 
	 * // setter 주입 public void setTire(Tire tire) { this.tire = tire;
	 * System.out.println("setTire(Tire) 호출..."); }
	 * 
	 * public void prnTireBrand() { System.out.println("장착된 타이어  : " +
	 * tire.getBrand()); }
	 */
	
	

	// 의존관계 발생
	private Tire tire;
	
	// DI(의존주입) : 1) 생성자를 통해서 받아옴
	public Car(Tire tire) {
		this.tire = tire;
	}
	
	// 타이어 없는 차
	public Car() {
		
	}
	
	
	/*
	 * public Car() { // 의존관계 설정을 누구로 할 것이냐에 따라 결과가 바뀜 // 근데 이거는 개발자가 필요한 시점에 객체를
	 * 생성하는 것이므로 싫어! // 외부에서 객체를 만들어내고 싶어!! tire = new KumhoTire(); // tire = new
	 * HankookTire(); }
	 */
	
	// DI(의존주입) : 2) setter 주입
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire()...11 : " + tire);
	}

	public void prnTireBrand() {
		System.out.println("장착된 타이어 : " + tire.getBrand());
	}
}

package aop.pojo;

public class Designer implements Employee {

	public void work() {
		Action.gotoOffice();
		System.out.println("제품디자인을 한다");
		Action.getoffoOffice();
	}
	
}

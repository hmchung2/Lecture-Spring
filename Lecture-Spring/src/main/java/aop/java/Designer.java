package aop.java;

import org.springframework.stereotype.Component;

@Component
public class Designer implements Employee {

	public void work() {
		System.out.println("제품디자인을 합니다");
	}

}

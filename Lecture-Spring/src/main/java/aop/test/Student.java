package aop.test;

import org.springframework.stereotype.Component;

@Component
public class Student implements Person {

	private int age;

	public void setAge(int age) {
		this.age = age;
	}

}

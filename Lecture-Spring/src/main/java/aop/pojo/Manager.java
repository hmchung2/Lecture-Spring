package aop.pojo;

public class Manager implements Employee {

	public void work() {

		// 문제1) 공통코드는 분리시키고 개발자가 코드작성을 안하면 실행이 안됨!!!
		System.out.println("팀원들과 회의를 합니다");
		
	}
	
}

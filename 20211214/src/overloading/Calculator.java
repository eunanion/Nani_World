package overloading;

public class Calculator {
	//생성자 2개이상 -> 생성자 오버로딩, 메서드 2개이상 - >메서드 오버로딩
	public void plus(int a) {//파라미터값으로 int a만 요구
		System.out.println(a + "에 1더한 값은 "+ (a+1)+ "입니다.");	
	}
	public void plus(int a , int b) { //파라미터 값으로 int a와 int b 요구
		
	System.out.println(a+" 에" + b+ "를 더한값은 "+ (a + b) + "입니다.");
	}
	
	public void plus(double a) { //파라미터값으로 double만 요구
		System.out.println(a + "에 0.5를 더한값은 "+(a+0.5)+ " 입니다.");
	}
	
	public void plus(String eifng) {// 파라미터값으로 String 요구
		System.out.println("문자는 계산할수 없습니다");
	}

}

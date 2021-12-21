package abstract1;

public abstract class Parent {
	// 추상 클래스
	// abstract선언이 붙은 클래스는 new를춧이용한
	// 직접적 객체 생성은 불가능하고 상속만 가능합니다.
	private int age;

	public  Parent() {
	this.age = 5 ;
    }
	// 추상메서드, 아래와 같이 실행문 없이 선언부만 작성합니다
	
	public abstract void getAge();
	
	// 추상클래스 내부의 일반 메서드는 그냥 평범하게 작성합니다
	// 일반 메서드는 오버라이딩은 자율적으로 할수 있습니다
	
	public void getInfo() {
		System.out.println("일반메서드 입니다.");
	}

}

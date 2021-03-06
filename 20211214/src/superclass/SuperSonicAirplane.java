package superclass;

public class SuperSonicAirplane extends Airplane {
	
	
	
	// 초음속 비행기는 비행기를 상속합니다
	// 초음속비행기도 일반 비행기처럼 속도값만 가집니다
	// 따라서 변수는 추가로 정의하지 않습니다.
	public SuperSonicAirplane(int velocity) {
	// 부모의 생성자는 상속되지 않습니다
	// 따라서 자식쪽에서 부모쪽 생성자에 전단할 값까지
	// 모두 처리해야 합니다.
	// 부모 생성자는 super();로 이름이 고정 입니다.
	 //자식쪽에서 물려준것을 부모쪽에서 파라미터 처리
	super(velocity);              // super로 먼저 변수선언해야함
	System.out.println("초음속 비행기 속도는 "+ velocity + " 입니다.");
	
	}
	
	//초음속 비행기 속도는 900이상 1300이하인 경우 호출됩니다
	//현재 supersonicairplane 내부이기 때문에
	//pulic void fly() 작성시, 오버라이딩이 일어나게 되는데
	//그럼에도 불구하고 일반 비행을 하게 되는 구간인 경우 super.fly()를 호출하면 됩니다.
	
	public void fly() {
		//속도가 900 이하로 판정된 경우
		if (velocity +500 <=  900) {
			
			super.fly(); // 부모쪽 fly() 를 호출함
			//private velocity 일경우 호출불가능, 
			//protected velocity로 바꿔줘야함
		} /*else {
			//속도가 900이상 1300이하인 경우 최대속도는 1300 가속은 500씩
			//if ~ else문으로 처리
			velocity +=500;
			System.out.println("초음속 비행중 입니다. 현재속도는 : "+ velocity + "km/h");
			if (velocity + 500 > 1300) {
				velocity = 1300;
				System.out.println("최대속도는 1300 km/h를 초과할수 없습니다.");
			}
		}*/
		else {
			
			if ((velocity + 500) > 1300) {
				velocity = 1300;
				System.out.println("최대속도는 1300 km/h를 초과할수 없습니다.");
			}else {
			velocity +=500;
			}
		
	        System.out.println("초음속 비행중 입니다. 현재속도는 : "+ velocity + "km/h");	
	}
	}
	
}

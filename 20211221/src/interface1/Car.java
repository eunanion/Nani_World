package interface1;

// 인터페이스 구현(상속이 아님!)
// extends 대신 implements를 사ㅛㅇ
// 인터페이스 내부에 추상메서드는 무조건 전부 구현해야합니다

public class Car implements  Vehicle {
	// 자동차라면 가져야 하는 변수 설정
	// 현재속도, 현재연료량, 차주
	
	private int speed;
	private int gas;
	private String name;
	
	//생성자를 만들어주세요, 차주만 입력받고 
	// 나머지 요소는 현재속도 0, 연료량 100자동으로 대입해주세요
	
	public Car (String name) {
		this.name = name;
		this.speed = MIN_SPD;
		this.gas = MAX_GAS;
		}

	@Override
	public void accel() {
		// 한 번 가속시 속도가 10씩 늘어나도록 해 주세요
		// 연료는 한 번 가속에 1씩 소비합니다
		// 단 속도는 200을 초과할수 없습니다.
		// 가속 이전에 가속했을 경우 200을 초과하는지 확인해 처리
		
		if(speed + CAR_SPD_DP > CAR_MAX_SPD) {
			speed =  CAR_MAX_SPD;
		} else {
		speed += CAR_SPD_DP;
		}
		
		gas -= CAR_FULE_DDP;
	    
		
		
	}

	@Override
	public void breakSpeed() {
		// 한 번 감속할때마다 속도가 10씩 줄도록 하세요
		// 단, 속도가 0 미만이 될수가 없습니다
		if (speed -CAR_SPD_DP < MIN_SPD) {
			speed = MIN_SPD;
		} else {
			speed -= CAR_SPD_DP;
		}
		
	}

	@Override
	public void reFuel() {
		// 연료는 다시 채울때마다 30씩 채워줍니다
		// 단, 연료 최대값은 상수 MAX_GAS를 이용해서 측정해주세요
		if(gas + CAR_FUEL_DP > MAX_GAS) {
			gas = MAX_GAS;
			
		} else {
			gas += CAR_FUEL_DP;
			
		}
		
	}

	@Override
	public void showStatus() {
		// 자동차의 정보를 조회할수 있도록 작성해주세요
		
		System.out.println("차주의 이름 : "+ name);
		System.out.println("현재 연료량 : " + gas);
		System.out.println("현재 속도 : "+ speed);
		System.out.println("==================");
	}
	
	

}

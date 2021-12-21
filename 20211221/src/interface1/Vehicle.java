package interface1;

// 인터페이스는 interface 선언을 사용합니다.
// 내부에는 상수인 값과 추상메서드만 선언할 수 있습니다.
// 애초에 구현(implements)을 전제로 설계되기 때문에
// 일반 변수, 메서드를 내부에 선언할 수 없습니다
// 다형성에서는 ㅂ모클래스의 역할을 합니다.
public interface Vehicle {
       //최대 연료량
	 //바로 상수로 잡힌다 
	int MAX_GAS = 100;
	int MIN_SPD =0;
	int MIN_GAS= 0;
	
	int CAR_MAX_SPD = 200;
	int CAR_SPD_DP = 10;
	int CAR_FUEL_DP=30;
	int CAR_FULE_DDP=1;
	
	int TRAIN_MAX_SPD = 300;
	int TRAIN_SPD_DP=50;
	int TRAIN_FUEL_DP=70;
	int TRAIN_FUEL_DDP=7;
	
	int AIRPLANE_MAX_SP = 900;
	int AIRPLANE_MAX_GAS=1000;
	int AIRPLANE_INCREASED_SP = 400;
	int AIRPLANE_DECREASED_SP = 300;
	int AIRPLANE_INCREASED_GAS = 500;
	int AIRPLANE_DECREASED_GAS = 150;
	
	// 얘는 static final 이다 
	
	//탈 것이라면 가지고 있을 공통적 기능을 전부 추상메서드로 작성
	// {
	//        실행문..
	// }
	// 와 같은 실행문 부분(메서드의 body) 없이 선언만 해 주세요.
	
	public void accel(); // 가속
	public void breakSpeed(); // 감속
	public void reFuel(); // 주유
	public void showStatus(); // 계기판 조회
	
}

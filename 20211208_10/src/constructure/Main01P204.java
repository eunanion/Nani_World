package constructure;

public class Main01P204 {

	public static void main(String[] args) {
		// 자동차 한 대를 만들어주세요.
		// 연료량은 100
		// 속도는 0
		// 주인은 본인이름 만들어주세요
		Car mine = new Car(100, 0 ,"이은환");
	    /*mine.owner = "이은환";
		mine.speed = 0;
		mine.gas = 100;*/
		
		//차를 뽑자마자 먼저 상태 확인
		mine.getInfo();
		// 엑셀을 두 번 밟아주세요
		// 상태 다시 확인
		mine.accelSpeed();
		mine.accelSpeed();
		mine.getInfo();
		
		// 브레이크를 밟아주세요
		
		//상태 다시 확인
		
		mine.breakSpeed();
		
		mine.getInfo();
		mine.putGas(); 
		mine.putGas();
		mine.putGas();
		mine.getInfo();
		
		

	}

}

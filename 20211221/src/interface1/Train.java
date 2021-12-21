package interface1;

public class Train implements Vehicle {
	
	private int speed;
	private int gas;
	private String name;
	
	public Train(String name) {
		this.name =name;
		this.gas = MAX_GAS;
		this.speed= MIN_SPD;
	}

	public void accel() {
		if(speed + TRAIN_SPD_DP > TRAIN_MAX_SPD) {
			speed = TRAIN_MAX_SPD;
		} else {
			speed += TRAIN_SPD_DP;
		}
		gas -=TRAIN_FUEL_DDP;
	}

	public void breakSpeed() {
		if(speed - TRAIN_SPD_DP < MIN_SPD) {
			speed = MIN_SPD;
		} else {
			speed -= TRAIN_SPD_DP;
		}
		
	}


	public void reFuel() {
		if(gas + TRAIN_FUEL_DP > MAX_GAS) {
			gas = MAX_GAS;
		} else {
			gas += TRAIN_FUEL_DP;
		}
	}

	
	public void showStatus() {
		System.out.println("기관사 이름 : "+ name);
		System.out.println("현재 연료량 : " + gas);
		System.out.println("현재 속도 : "+ speed);
		System.out.println("==================");
		
	}
	


}

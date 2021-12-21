package interface1;

public class Airplane implements Vehicle {

	private int currentSpeed;
	private int currentGas;
	private String name;
	
	public Airplane(String name) {
		this.name = name;
		this.currentSpeed= currentSpeed;
		this.currentGas = currentGas;
		
	}
	
	
	public void accel() {
		if(currentSpeed + AIRPLANE_INCREASED_SP > AIRPLANE_MAX_SP ) {
			currentSpeed=AIRPLANE_MAX_SP;
		} else {
			currentSpeed += AIRPLANE_INCREASED_SP;
		}
		currentGas -= AIRPLANE_DECREASED_GAS;
		
	}

	
	public void breakSpeed() {
		if (currentSpeed - AIRPLANE_DECREASED_SP < MIN_SPD) {
			currentSpeed=  MIN_SPD;
		}else {
			currentSpeed-= AIRPLANE_DECREASED_SP;
		}
		currentGas -= AIRPLANE_DECREASED_GAS;
	}

	public void reFuel() {
		if(currentGas+ AIRPLANE_INCREASED_GAS > AIRPLANE_MAX_GAS) {
			currentGas = AIRPLANE_MAX_GAS;
		} else {
			currentGas += AIRPLANE_INCREASED_GAS;
		}
		
	}

	
	public void showStatus() {

		System.out.println("기장 이름 : "+ name);
		System.out.println("현재 연료량 : " + currentGas);
		System.out.println("현재 속도 : "+ currentSpeed);
		System.out.println("==================");
		
	}
 

}

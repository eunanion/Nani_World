package interface1;

public class Main02P320 {

	public static void main(String[] args) {
		Vehicle t1 = new Train("이은환");
		
		t1.accel();
		t1.accel();
		t1.accel();
		t1.accel();
		t1.accel();
		t1.accel();
		t1.accel();
		t1.accel();
		t1.accel();
		t1.showStatus();
		
		t1.breakSpeed();
		t1.breakSpeed();
		t1.breakSpeed();
		t1.showStatus();
		t1.reFuel();
		t1.showStatus();
		

	}

}

package overloading;

public class Main01 {

	public static void main(String[] args) {
		Calculator cal1 = new Calculator();
		cal1.plus(3);
		Calculator cal2 = new Calculator();
		cal2.plus(3,4);
		Calculator cal3 = new Calculator();
		cal3.plus(3.4);
		Calculator cal4 = new Calculator();
		cal1.plus("뾰로로로로로로롱");
		

	}

}

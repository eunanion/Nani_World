package overloading;

public class Main02 {

	public static void main(String[] args) {
		// 알바생 둘을 만들어주세요
		//한명은 시급 15000원, 다른 한명은 입력없이 생성해주세요
		
		Parttimer a1 = new Parttimer(true, 15000, "모모스테이크", "이재용");
		Parttimer a2 = new Parttimer(true, "모모스테이크", "정몽구");
		Parttimer a3 = new Parttimer(true, -1000, "모모스테이크", "박진영");
	
		

	}

}

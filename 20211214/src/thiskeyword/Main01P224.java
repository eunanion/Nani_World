package thiskeyword;

public class Main01P224 {

	public static void main(String[] args) {
		// Person을 2명 생성해보되
		// 생성지 지역간 데이터 교환을 염두에 두고 확인해가며 생성해보세요
		// 생성된 Person은 getInfo()를 실행합니다.
		Person a = new Person("이은환",23,324,"기계");
		
		a.getInfo();
		
        Person b = new Person("이은진",21,124,"간호학");
		
		b.getInfo();
		
		
	}

}

package accessmodifier2;

import accessmodifier.Warrior;

public class Main2P197 {

	public static void main(String[] args) {
		Warrior a = new Warrior("타락파워전사");
		//a.hp= 3000; // < 원래는 바뀌면 안되지만, 프로그램 구조상 조작이 가능하다 (핵의 원리)
		// 이제 패키지가 달라져서 접근 불가능
		a.hunt();
		a.hunt();
		a.hunt();
		//1. 패키지 프랜들리 (정의부 내 public 없이 변수선언   - > 다른 패키지에서 접근 x

	}

}

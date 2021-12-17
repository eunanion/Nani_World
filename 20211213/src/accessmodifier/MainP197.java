package accessmodifier;

public class MainP197 {

	public static void main(String[] args) {
		Warrior a = new Warrior("타락파워전사");
		//a.hp= 3000; // < 원래는 바뀌면 안되지만, 프로그램 구조상 조작이 가능하다 (핵의 원리)
		//private 쓰는순간 아예 접근이 안됨, 해당 변수는 private 선언된 클래스 내에서만 변경가능
		a.hunt(); //매서드가 돌아가는 이유는 public이기 때문
		a.hunt();
		a.hunt();
		//1. 패키지 프랜들리 (정의부 내 public 없이 변수선언   - > 다른 패키지에서 접근 x


	}

}
 
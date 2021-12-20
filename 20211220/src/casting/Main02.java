package casting;

public class Main02 {

	public static void main(String[] args) {
		// Animal로 cat을 받아서 생성 
		Animal a = new Cat("룰루",3);
		//a 변수와 연결된 heap쪽 자료가 cat인지 확인
		System.out.println(a instanceof Cat);
		System.out.println(a instanceof Dog);
		System.out.println(a instanceof Animal);
		//쓸일은 많이 없고 이런게 있다 정도로 알아두면됨

	}

}

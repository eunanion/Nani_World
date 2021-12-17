package structure;

public class Structure01P190 {

	public static void main(String[] args) {
		// 이제부터는 실행코드와 정의 코드를 분리
		// main이 있는 클래스는 실행만 하고
		// 실체 로직은 다른 .java파일에 저장한다
		
		
		Person p1 = new Person();
		

		//p1 내부에 정의한 변수를
		//p1.변수명 = 대입할 값; 형태로 저장
		p1.age = 23;
		p1.name = "으나니";
		p1.pNum = "010-9093-123121";
		p1.uNum = 1221;
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.pNum);
		System.out.println(p1.uNum);
		//또 다른사람을 만들어 봅니다
		Person p2= new Person();
		//p2 에도 위에처럼 정보를 넣으세요
		p2.age = 233;
		p2.name = "욱나난";
		p2.pNum = "0410-923193-122321";
		p2.uNum = 122321;
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.pNum);
		System.out.println(p2.uNum);
		
		System.out.println(p1.name + " 의 정보입니다.");
		System.out.println("이름 " + p1.name + ", 나이 : " + p1.age + ", 연락처 :"+p1.uNum+ ", 번호 :"+p1.uNum );
		System.out.println("이름 " + p2.name + ", 나이 : " + p2.age + ", 연락처 :"+p2.uNum+ ", 번호 :"+p2.uNum );
		
	}

}

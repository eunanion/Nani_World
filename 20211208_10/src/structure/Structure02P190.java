package structure;

public class Structure02P190 {
	
	public static void getInfo(Person p) {
		System.out.println(p.name + "에 대한 정보입니다");
		System.out.println("이름: " + p.name + ", 나이 : "+p.age + ", 연락처 : "+ p.pNum + ", 번호 : "+p.uNum);
	}
	
	
	public static void main(String[] args) {
		//사람을 2명 만들어 보세요.(a,b)
		
		
		Person a = new Person();
		
		
		a.name = "김두환";
		a.age = 27;
		a.pNum = "010-2343-2131";
		a.uNum = 21343223;
		
		Person b = new Person();

		b.name = "구마적";
		b.age = 29;
		b.pNum = "010-3433-2131";
		b.uNum = 55422233;
		System.out.println(a.name + " 의 정보입니다.");
		System.out.println("이름 " + a.name + ", 나이 : " + a.age + ", 연락처 :"+a.pNum+ ", 번호 :"+ a.uNum );
		System.out.println(b.name + " 의 정보입니다.");
		System.out.println("이름 " + b.name + ", 나이 : " + b.age + ", 연락처 :"+b.pNum+ ", 번호 :"+ b.uNum );
		
		// 정보가 많아지면 일일이 선언명을 고치기 어려움
		// Per내부의 정보를 쉽게 조회하기 위한 매서드 생성
		getInfo(a); //a의 주소값을 getinfo의 p에 전달
		getInfo(b); //b의 주소값을 getinfo의 p에 전달
	}


	
	
	
}

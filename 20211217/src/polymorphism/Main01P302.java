package polymorphism;

public class Main01P302 {

	public static void main(String[] args) {
		// 부모타입은 Person으로 자식인 Student까지 받을 수 있음
		
		Person p1 = new Person("나사람",10);
		Person s1 = new Student("나학생",10,100);
		
		// p1과 s1의 showPerson은 다르게 돌아간다
		p1.showPerson();
		s1.showPerson();
		// s1은 person타입이므로 person에 소속된 자원만 호출할수있다
		//s1.showStudent();
		
	}

}

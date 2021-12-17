package inheritance;


	// 상속 문법
	// 클래스명칭 오른쪽에 <extends 부모클래스 이름> 을 적는다
	// 이렇게 접속한 클래스는 부모, 자식클래스는 하나의 객체 내부에 
	// 공존하는 형태로 메모리에 생성
	public class Student extends Person {
		// name, age
		// getinfo() 는 자동으로 작성
		public int stuNum;
		
		public void getStudentInfo() {
			System.out.println("이름은 : " +name +" 나이는 " + age + " 학번은 "+ stuNum);
		}
		
	}


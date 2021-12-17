package inheritance;

public class Main01P254 {

	public static void main(String[] args) {
		
		// Student가 Person을 상속했기 때문에
		// Student는 Person의 자원을 사용할 수 있습니다.
		Student a = new Student();
		a.name =  "이으난";
		a.age = 20;
		a.stuNum = 34323;
		
		a.getInfo();
		a.getStudentInfo();
		

	}

}

package inheritance;

public class Main02P254 {

	public static void main(String[] args) {

		
		// 여기에 학생 하나와 샐러리맨 하나를 임의로 만들어보세요
		// 샐러리맨에는 본인 이름과 희망 연봉을 적어주세요.
		// 학생은 그냥 알아서 작성해주세요
		
		
		Salaryman b = new Salaryman();
		b.name = "으나니";
		b.age = 20;
		b.salary = 999999;
		
		b.getSalaryInfo();

		Student c = new Student();
		c.name = "손오공";
		c.age = 20;
		c.stuNum = 959505;
		
		c.getStudentInfo();
	}

}

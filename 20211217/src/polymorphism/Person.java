package polymorphism;

public class Person {

	
		// 사람을 나타내는 클래스
		// 상속만을 목적으로 하는 클래스
		// Person을 상속받은 자식들은 전부
		// Person을 요구하는 자리에 대입될 수 있습니다.
		
		private String name;
		private int age;
		
		//이름과 나이를 입력받아 초기화하는 생성자 생성
		
		public Person(String name, int age) {
			this.age = age;
			this.name = name;
			
		}

		
		public void showPerson() {
			System.out.println("나이는 : "+this.age + ",이름은 : "+ this.name);
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}
	
		
		

}

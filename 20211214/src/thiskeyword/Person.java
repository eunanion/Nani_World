package thiskeyword;

public class Person {
	
	//사람의 정보를 여기 기입합니다.
	private String name;
	private int age;
	private int money;
	private String major;
	
	public Person(String name, int a , int money ,String major) {
		this.name = name ;
		this.age = age;
		this.money = money;
		this.major = major;
		// name=name 할 경우 펄슨생성자 지역 name = 펄슨클래스 name이 된다.
		// 따라서 this.name을 입력할 경우 가장 상위클래스의 이름을 끌고올수가 있다.
		// 중괄호 여닫는곳은 하나의 지역으로 간주하라 ->그림 그려보기
		// 하위지역에 데이터가 발견이 안되면 상위지역의 데이터를 끌고온다. 생성자지역엔 name이 없으므로
		// 상위지역에서 끌고온것
	}
	// 이름,  나이 소지금액, 전공을 콘솔에 찍어주는 getInfo()를 작성해주세요.
	public void getInfo() {
		System.out.println("이름은 : " + this.name); //name, this.name 둘다 된다. 하지만 생성자와 동등한 지역이므로
		                                          // 생성자 지역이 아닌 최상위 지역 퍼슨에서 name을 끌고온다
		                                          //여기에서는 의미가 없는게
		                                         // 생성자에서 받은 변수를 이미 최상위클래스에 전달됨 
		                                       // 사실상 똑같음
		System.out.println("나이는 : " + age);
		System.out.println("소지금은 : " + this.money);
		System.out.println("전공은 : " + major);
	
	}

}

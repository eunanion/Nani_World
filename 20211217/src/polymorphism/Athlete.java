package polymorphism;

public class Athlete extends Person{
	
	private String event;
	
	public Athlete (String name, int age , String event) {
		super(name,age);
		this.event= event;
	}

	public void showPerson() {
		super.showPerson();
		System.out.println("운동선수의 종목 : "+ event );
	}
}

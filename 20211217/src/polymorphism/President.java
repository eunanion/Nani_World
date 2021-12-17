package polymorphism;

public class President extends Person {
	private int terms;
	
	public President (String name,int age ,int terms) {
		super(name,age);
		this.terms= terms;
		
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.println("대통령의 임기 : "+ terms);
	}

}

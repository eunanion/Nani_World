package structure;

public class cat1 {
	public static void getInfo(Cat c) { //Cat의 실행부
		System.out.println("< " + c.name+" >의 정보입니다." );
		System.out.println("이름 : <" + c.name+">"+" 나이 : <" + c.age+">" + "성별 : <" + c.sex+">");
	}

	public static void main(String[] args) {
	
		
		Cat a = new Cat();
		
		
		
		a.name = "뽀삐";
		a.age = 3;
		a.sex = "수컷";
	
		
		Cat b = new Cat();

		b.name = "냥냥이";
		b.age = 2;
		b.sex = "암컷";
		
		getInfo (a);	
		getInfo (b);
	}

}

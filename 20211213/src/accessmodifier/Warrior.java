package accessmodifier;

public class Warrior {
	
	// hp,mp,lv,exp,atk,def
	//선언
	 private String name;
	 private int hp;
	 private int mp;
	 private int lv;
	 private int exp;
	 private int atk;
	 private int def;
	 
	 //변수값은 현실에서도 특정한 물체나 사람의 상태가 휙휙 바뀌지 않으므로
	 //외부에서 값을 함부로 고칠수 없도록 private으로 처리한다

	//생성자를 만들어주셍7
	public Warrior(String n) {
		name = n;
		hp = 20;
		mp = 10;
		lv = 1;
		atk = 3;
		def = 0;
		exp = 0;
		System.out.println("아이디 : " + name + " 직업 : 전사로 생성 완료 하였습니다");
	}
	
	
	public void hunt() {
		hp -= 2;
		exp += 10;
		System.out.println("현재 체력은 "+hp+" 입니다.");
		System.out.println("현재 경험치는 "+exp + " 입니다.");
		
	}
	//생성자를 비롯한 메서드는 행동을 나타내고
	// 이런 행동의 성공/실패 여부는 오로지 정보(변수)
	//에 의하여 결정되며 시도 자체에 대해서는
	// 제한을 두지 않는다.
	// 변수 - > private , 메서드 -> public 객체지향의 대전제!!!!->우리의 존재(객체) 행동/상태(지향)와 코딩 묘사가 일치함.
	
}

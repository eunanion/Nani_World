package game.modifier;

public class Commoner {
    //private 요소는 자식쪽에서도 조회나 수정이 불가능 합니다.
	//보안성이 제일뛰어나기 때문에 private을 무조건 써야한다면
	//setter,getter라는것을 이용해 보조합니다.
	private int mp;
	private int hp; 
	private int lv;
	private int exp;
	private String name;
	
	public Commoner(String name) {
		this.name = name;
		this.mp = 20;
		this.hp = 10;
		this.lv = 1;
		this.exp = 0;
		// setter/getter 의 기본형을 만드는 방법은
		// 마우스우클릭 -> source -> generate getters/setters 를 선택해 자동으로
		// 생성해줄수 있습니다
		
		
		
		
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getHp() {
		return hp ;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
}

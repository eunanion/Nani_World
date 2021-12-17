package game.polymorphism;
//모든 사냥감의 뼈대가 되는 클래스
public class Monster {
	
	// name(몬스터 종류), hp , mp ,atk
	// 생성자까지 만들어주세요.
	private String name;
	private int hp;
	private int atk;
	
	public Monster(String name, int hp, int atk) {
		
		this.name = name;
		this.hp = hp;
		this.atk = atk;
	}
	
	public void doBattle(int uAtk) {
	
		this.hp = hp - uAtk;
		if(hp <= 0) {
		hp = 0;
		System.out.println(this.name + "이/가 죽어서 반응하지 않습니다.");
		return;// 메서드를 여기서0 종료합니다.
		}
		System.out.println("몬스터의 남은 체력 : " + this.hp);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.apk = atk;
	}

}

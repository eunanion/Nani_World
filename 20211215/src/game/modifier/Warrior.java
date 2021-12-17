package game.modifier;

public class Warrior extends Commoner{
	
	
	public Warrior(String name) {
		super(name);
		System.out.println(name + "님 메이플 웓드에 오신걸 환영합니다.");
	}
	public void doubleAttack() {
		setHp(getHp()-4);
		setExp(getExp()+25);
		if (getExp() > 70) {
			setExp(0);
			setLv(getLv() + 1);
			System.out.println(getLv()+"레벨업 ㅊㅋㅋ");
		}
	}
	public void hunt() {
		setMp(getMp()-3);
		setExp(getExp()+25);
		
		if (getExp() > 70) {
			setExp(0);
			setLv(getLv() + 1);
			System.out.println(getLv()+"레벨업 ㅊㅋㅋ");
		}
		
		
	}
	public void howl() {
		setMp(getMp()-10);
		setHp(getHp()+20);
			
	}
	

	
	public void getInfo() {
		
	System.out.println("현재 체력 : "+ getHp());
	System.out.println("현재 마나 : "+ getMp());
	System.out.println("현재 레벨 : "+ getLv());
	System.out.println("현재 경험치 : "+ getExp());
	System.out.println("유저명 : "+ getName());
	
	}
	
	
}

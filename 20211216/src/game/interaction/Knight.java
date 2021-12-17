package game.interaction;

public class Knight {
	
	private int hp;
	private int exp;
	private int atk;
	private int def;
	private int mp;
	
	public Knight () {
		this.hp = 250;
		this.mp = 120;
		this.atk = 30;
		this.def = 300;
		this.exp = 0;
				
	}
	
	public void orcHunt(Orc orc) {
		orc.doBattle(this.atk);
		if (orc.getHp() > 0) {
		this.hp = this.hp +this.def - orc.getAtk();
		} else {  
			System.out.println("오크를 죽였습니다.");
			return;
		} 
	   System.out.println("현재 체력 : " + this.hp);
			
		
		
	}
	public void trollHunt(Troll troll) {
		
		troll.doBattle(this.atk);
		if (troll.getHp() > 0) {
		this.hp = this.hp + this.def -troll.getAtk();
	} else {
		System.out.println("트롤을 죽였습니다.");
	} System.out.println("현재 체력 : " + this.hp);
	}	
	
	public void getInfo() {
		System.out.println("현재체력 : " +this.hp +  ", 현재 경험치 : "+ this.exp);
	}
public void huntMushroom(Mushroom mushroom) {
		
		mushroom.doBattle(this.atk);
	
		if (mushroom.getHp() > 0) {
			this.hp = this.hp + this.def - mushroom.getAtk();
			System.out.println("기사의 남은 체력은 " + this.hp);
			
		}else {
			System.out.println("머쉬룸을 죽였습니다");
		}
		System.out.println("기사의 남은 체력은 " + this.hp);
		
		
	}
}

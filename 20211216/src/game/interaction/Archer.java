package game.interaction;

public class Archer {

		
		private int hp;
		private int exp;
		private int atk;
		private int def;
		private int mp;
		private boolean death;
		
		public Archer () {
			this.hp = 150;
			this.mp = 100;
			this.atk = 100;
			this.def = 20;
			this.exp = 0;
			this.death = true;		
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
				System.out.println("궁수의 남은 체력은 " + this.hp);
				
			}else {
				System.out.println("머쉬룸을 죽였습니다");
			}
			System.out.println("궁수의 남은 체력은 " + this.hp);
			
			
		}
	}


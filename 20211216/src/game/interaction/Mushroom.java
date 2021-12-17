package game.interaction;

public class Mushroom {

	private int atk;
	private int hp;
	private int def;
	
	public Mushroom() {
		this.hp = 400;
		this.atk = 50;
		this.def = 30;
	}
	
	public void doBattle(int uAtk) {
		if (this.hp > 0) {
		this.hp = this.hp + this.def - uAtk;
		} else {
			System.out.println( "죽었다고 이생캬 ㅠㅠ ");
		}
		
		
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
	
}

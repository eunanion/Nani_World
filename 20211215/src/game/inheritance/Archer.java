package game.inheritance;

public class Archer extends Commoner {
	
	private int rDam;
	
	public Archer(String name) {
		
		super(name);
		super.mp = 80;
		super.hp =200;
		super.lv = 10;
		this.rDam = 300;	
	}
	public void getInfo() {
		System.out.println("레벨 : "+ lv+"   "+id+" 님의 현재 체력은 "+hp+" 마나  "+mp
				+ " 입니다." );
		System.out.println("원거리 데미지는 "+ rDam + " 입니다. ");
	}

}

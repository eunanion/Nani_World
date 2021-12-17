package game.inheritance;

public class Warrior extends Commoner{
	
	private int pDam;
	
	public Warrior (String name) {
		super(name);
		this.pDam = 1000;
		super.hp= 100;
		super.mp= 50;
		super.lv= 10;
			
	}
	public void getInfo(){
		
			System.out.println("레벨 : "+ lv+"   "+id+" 님의 현재 체력은 "+hp+" 마나  "+mp
					+ " 입니다." );
			System.out.println("물리데미지력은 "+ pDam + " 입니다. ");
		
	

	
 }
}


package game.inheritance;

public class Magician extends Commoner {
	

	private int mDam;
	
    public Magician(String name) {
    	super(name);
    	super.hp = 50;
    	super.mp = 200;
    	super.lv = 8;
    	this.mDam = 300;	
    }
    public void getInfo() {
    	System.out.println("레벨 : "+ lv+"   "+id+" 님의 현재 체력은 "+hp+" 마나  "+mp
				+ " 입니다." );
		System.out.println("마력데미지는 "+ mDam + " 입니다. ");
    }


}

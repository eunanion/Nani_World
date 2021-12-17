package intreraction;

public class Seller {
	
	private int mango;
	private int orange;
	private int money;
	
	public Seller(int mango, int orange) {
		this.mango = mango;
		this.money = 0;
		this.orange = orange;		
	
	}
	
	public void sellMango(int mango) {
		if(this.mango < mango) {
			System.out.println("망고가 모자랍니다. 현재 재고 : " + this.mango);
			return;
		}
		this.mango -= mango;
		this.money += mango * 4000;
	}
	public void sellOrange(int orange) {
		if(this.orange < orange) {
			System.out.println("오렌지가 모자랍니다. 현재 재고 : " + this.mango);
			return;
		}
		this.orange -= orange;
		this.money += orange * 2000;
	}
	
	public void showSeller() {
		System.out.println("-------상인정보-------");
		System.out.println("현재소지금 : " + this.money + ", 현재망고재고 : " + this.mango +
				", 현재오렌지재고 : " + this.orange);
		System.out.println("--------------------");

	}	
	public int getMango() {
		return this.mango;
	}
	public int getOrange() {
		return this.orange;
	}
}	
	


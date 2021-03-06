package intreraction;

import interaction.Seller;

public class Buyer {
	
	private int money;
	private int mango; 
	private int orange;
	
	public Buyer(int money) {
		this.money = money;
		this.mango = 0;
		this.orange = 0;
	}
	
	
	public void buyMango(Seller seller, int mango) {
		
		if((mango*4000) > this.money) {
			System.out.println("돈이 모자랍니다. 소지금 : " + this.money);
			return; 
		}
		
		if(seller.getMango() < mango) {
			System.out.println("망고재고가 부족합니다. 망고 재고 : " + seller.getMango());
			return;
		}
		
		this.money -= mango * 4000;
		this.mango += mango;
		
		seller.sellMango(mango);
	}
	
        public void buyOrange(Seller seller, int orange) {
		
		if((orange*2000) > this.money) {
			System.out.println("돈이 모자랍니다. 소지금 : " + this.orange);
			return; 
		}
		
		if(seller.getOrange() < orange) {
			System.out.println("오렌지재고가 부족합니다. 오렌지 재고 : " + seller.getMango());
			return;
		}
		
		this.money -= orange * 2000;
		this.orange += orange;
		
		seller.sellOrange(orange);
	}
	
	
	public void showBuyer() {
		System.out.println("----------구매자 정보----------");
		System.out.println("소지중인 망고개수 : " + mango +
				"소지중인 오렌지개수 : " + orange +", 잔여금액 : " + money);
		System.out.println("-----------------------------");
	}

}

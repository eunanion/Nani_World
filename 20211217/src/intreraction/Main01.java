package intreraction;

import interaction.Buyer;
import interaction.Seller;

public class Main01 {

	public static void main(String[] args) {
		Seller s1 = new Seller(30,20);
		Seller s2 = new Seller(5,10);
		Buyer b1 = new Buyer(1000000); 
		
		s1.showSeller();
		s2.showSeller();
		b1.showBuyer();
		
		System.out.println("============s2에게구매==============");

		b1.buyMango(s2, 5);
		b1.buyOrange(s2, 5);
		s1.showSeller();
		s2.showSeller();
		b1.showBuyer();
		
		System.out.println("============s1에게구매==============");
		
		b1.buyMango(s1, 10);
		b1.buyOrange(s1, 20);
		
		s1.showSeller();
		s2.showSeller();
		b1.showBuyer();
		
	}

	}



package game.polymorphism;

public class Main02 {

	public static void main(String[] args) {
		
		Commoner a1 = new Commoner("νλΌλ");
		Monster b1 = new Troll();
		Monster b2 = new Mushroom();
		Monster b3 = new Slime();
		Monster b4 = new Orc();
		
		
		a1.hunt(b1);
     	a1.hunt(b1);
		a1.hunt(b1);

		a1.hunt(b2);
     	a1.hunt(b2);
		a1.hunt(b2);
		a1.hunt(b2);
		a1.hunt(b2);
		a1.hunt(b2);
		a1.hunt(b2);
		a1.hunt(b2);
		a1.hunt(b2);
		a1.hunt(b2);
		a1.hunt(b2);
		a1.hunt(b2);
		
		a1.hunt(b3);
		a1.hunt(b3);

	}

}
